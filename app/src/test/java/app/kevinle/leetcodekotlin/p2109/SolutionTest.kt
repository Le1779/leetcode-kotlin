package app.kevinle.leetcodekotlin.p2109

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

/**
 * Created by Kevin Le on 2024/12/3.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.addSpaces("LeetcodeHelpsMeLearn", intArrayOf(8,13,15))
        assertEquals(result, "Leetcode Helps Me Learn")
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.addSpaces("icodeinpython", intArrayOf(1,5,7,9))
        assertEquals(result, "i code in py thon")
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.addSpaces("spacing", intArrayOf(0,1,2,3,4,5,6))
        assertEquals(result, " s p a c i n g")
    }
}