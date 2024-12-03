package app.kevinle.leetcodekotlin.p136

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

/**
 * Created by Kevin Le on 2024/12/3.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.singleNumber(intArrayOf(2,2,1))
        assertEquals(result, 1)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.singleNumber(intArrayOf(4,1,2,1,2))
        assertEquals(result, 4)
    }
}