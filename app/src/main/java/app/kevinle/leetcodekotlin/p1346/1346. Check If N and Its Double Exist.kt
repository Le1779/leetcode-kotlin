package app.kevinle.leetcodekotlin.p1346

/**
 * Created by Kevin Le on 2024/12/2.
 */
class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        for (i in arr) {
            if (set.contains(i * 2)) {
                return true
            }

            if (i % 2 == 0 && set.contains((i / 2))) {
                return true
            }

            set.add(i)
        }

        return false
    }
}