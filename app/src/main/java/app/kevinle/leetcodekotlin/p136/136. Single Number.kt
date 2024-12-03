package app.kevinle.leetcodekotlin.p136

/**
 * Created by Kevin Le on 2024/12/3.
 */
class Solution {
    fun singleNumber(nums: IntArray): Int {
        var single = 0
        for (i in nums) {
            single = single xor i
        }

        return single
    }
}