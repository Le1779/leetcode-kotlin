package app.kevinle.leetcodekotlin.p201

/**
 * Created by Kevin Le on 2024/12/3.
 */
class Solution {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var l = left
        var r = right
        var shift = 0
        while (r > l) {
            println("${r}, ${l}")
            r = r shr 1
            l = l shr 1
            shift++
        }

        return r shl shift
    }
}