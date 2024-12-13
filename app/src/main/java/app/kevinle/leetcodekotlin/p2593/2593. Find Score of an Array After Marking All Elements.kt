package app.kevinle.leetcodekotlin.p2593

/**
 * Created by Kevin Le on 2024/12/9.
 */
class Solution {
    fun findScore(nums: IntArray): Long {
        val indexMap = mutableMapOf<Int, MutableList<Int>>()
        for (i in nums.indices) {
            val n = nums[i]
            if (indexMap.containsKey(n)) {
                indexMap[n]?.add(i)
            } else {
                indexMap[n] = mutableListOf(i)
            }
        }

        var score: Long = 0
        val markArray = BooleanArray(nums.size) { false }
        val sortedNums = nums.sorted()
        for (n in sortedNums) {
            val indexList: MutableList<Int> = indexMap[n] ?: return score
            val index = indexList[0]
            indexList.removeAt(0)

            if (!markArray[index]) {
                mark(markArray, index)
                score += n
            }

            if (indexList.isEmpty()) {
                indexMap.remove(n)
            } else {
                indexMap[n] = indexList
            }
        }

        return score
    }

    private fun mark(markArray: BooleanArray, index: Int) {
        markArray[index] = true
        if (index > 0) {
            markArray[index - 1] = true
        }

        if (index < markArray.size - 1) {
            markArray[index + 1] = true
        }
    }
}