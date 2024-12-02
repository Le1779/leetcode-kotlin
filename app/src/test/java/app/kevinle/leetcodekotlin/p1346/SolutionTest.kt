package app.kevinle.leetcodekotlin.p1346

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/12/2.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.checkIfExist(intArrayOf(10,2,5,3))
        Assertions.assertEquals(result, true)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.checkIfExist(intArrayOf(3,1,7,11))
        Assertions.assertEquals(result, false)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.checkIfExist(intArrayOf(-2,0,10,-19,4,6,-8))
        Assertions.assertEquals(result, false)
    }

    @Test
    fun case4() {
        val solution = Solution()
        val result = solution.checkIfExist(intArrayOf(0,0))
        Assertions.assertEquals(result, true)
    }
}