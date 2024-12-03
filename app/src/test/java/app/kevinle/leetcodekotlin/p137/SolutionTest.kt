package app.kevinle.leetcodekotlin.p137

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

/**
 * Created by Kevin Le on 2024/12/3.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.singleNumber(intArrayOf(2,2,3,2))
        assertEquals(result, 3)
    }
}