package app.kevinle.leetcodekotlin.p20
import java.util.ArrayDeque

/**
 * Created by Kevin Le on 2024/12/13.
 */
class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (c in s) {
            if (c == '(') {
                stack.addFirst(')')
            } else if (c == '[') {
                stack.addFirst(']')
            } else if (c == '{') {
                stack.addFirst('}')
            } else if (stack.isEmpty() || stack.removeFirst() != c) {
                return false
            }
        }

        return stack.isEmpty()
    }
}