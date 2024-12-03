package app.kevinle.leetcodekotlin.p191

/**
 * Created by Kevin Le on 2024/12/3.
 */
class Solution {
    fun hammingWeight(n: Int): Int {
        var weight = 0
        for (i in 0 until 32) {
            if ((n shr i) and 1 == 1) {
                weight++
            }
        }

        return weight
    }
}