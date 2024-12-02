package app.kevinle.leetcodekotlin.p67

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/12/2.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.addBinary("11", "1")
        Assertions.assertEquals(result, "100")
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.addBinary("1010", "1011")
        Assertions.assertEquals(result, "10101")
    }
}