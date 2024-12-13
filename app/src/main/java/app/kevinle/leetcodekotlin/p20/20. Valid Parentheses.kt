package app.kevinle.leetcodekotlin.p20
import java.util.ArrayDeque

/**
 * Created by Kevin Le on 2024/12/13.
 */
class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (c in s) {
            if (c == ')' || c == ']' || c == '}') {
                val openedSymbol = getOpenedSymbol(c)
                var isClosed = false
                while (stack.isNotEmpty()) {
                    val top = stack.removeFirst()
                    if (top != openedSymbol) {
                        return false
                    } else {
                        isClosed = true
                        break
                    }
                }

                if (!isClosed) {
                    return false
                }
            } else {
                stack.addFirst(c)
            }
        }

        return stack.isEmpty()
    }

    private fun getOpenedSymbol(openSymbol: Char): Char {
        return when (openSymbol) {
            ')' -> '('
            ']' -> '['
            '}' -> '{'
            else -> ' '
        }
    }
}