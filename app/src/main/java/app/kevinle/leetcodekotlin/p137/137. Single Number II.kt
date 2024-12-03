package app.kevinle.leetcodekotlin.p137

/**
 * Created by Kevin Le on 2024/12/3.
 */
class Solution {
    fun singleNumber(nums: IntArray): Int {
        var ans = 0
        for (i in 0 until 32) {
            var count = 0
            for (n in nums) {
                count += (n shr i) and 1
            }

            ans += (count % 3) shl i
        }

        return ans
    }
}