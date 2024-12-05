package app.kevinle.leetcodekotlin.p201

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

/**
 * Created by Kevin Le on 2024/12/3.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.rangeBitwiseAnd(5, 7)
        assertEquals(result, 4)
    }
}