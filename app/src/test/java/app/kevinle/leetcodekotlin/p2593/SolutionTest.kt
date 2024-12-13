package app.kevinle.leetcodekotlin.p2593

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

/**
 * Created by Kevin Le on 2024/12/9.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.findScore(intArrayOf(2,1,3,4,5,2))
        assertEquals(result, 7)
    }
}