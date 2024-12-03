package app.kevinle.leetcodekotlin.p190

/**
 * Created by Kevin Le on 2024/12/2.
 */
class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n: Int):Int {
        var ans = 0
        for (i in 0 until 32) {
            ans += (n shr i) and 1

            if (i < 31) {
                ans = ans shl 1
            }
        }

        return ans
    }
}