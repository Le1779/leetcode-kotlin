package app.kevinle.leetcodekotlin.p20

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

/**
 * Created by Kevin Le on 2024/12/13.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.isValid("()")
        assertEquals(result, true)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.isValid("([])")
        assertEquals(result, true)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.isValid("(]")
        assertEquals(result, false)
    }

    @Test
    fun case4() {
        val solution = Solution()
        val result = solution.isValid("([)]")
        assertEquals(result, false)
    }

    @Test
    fun case5() {
        val solution = Solution()
        val result = solution.isValid("(")
        assertEquals(result, false)
    }
}