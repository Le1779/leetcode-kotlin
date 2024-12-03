package app.kevinle.leetcodekotlin.p191

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

/**
 * Created by Kevin Le on 2024/12/3.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.hammingWeight(11)
        assertEquals(result, 3)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.hammingWeight(128)
        assertEquals(result, 1)
    }
}