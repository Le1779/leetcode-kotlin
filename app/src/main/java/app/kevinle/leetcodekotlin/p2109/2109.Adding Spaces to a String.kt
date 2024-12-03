package app.kevinle.leetcodekotlin.p2109

/**
 * Created by Kevin Le on 2024/12/3.
 */
class Solution {
    fun addSpaces(s: String, spaces: IntArray): String {
        if (spaces.isEmpty()) {
            return s
        }

        val sb = StringBuilder()
        val length = s.length + spaces.size
        var nextSpace = 0
        for (i in 0 until length) {
            if (nextSpace < spaces.size && i == (spaces[nextSpace] + nextSpace)) {
                sb.append(' ')
                nextSpace++
            } else {
                sb.append(s[i - nextSpace])
            }
        }

        return sb.toString()
    }
}