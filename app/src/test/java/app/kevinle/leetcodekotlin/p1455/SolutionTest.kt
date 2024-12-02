package app.kevinle.leetcodekotlin.p1455

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/24.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.isPrefixOfWord("i love eating burger", "burg")
        Assertions.assertEquals(result, 4)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.isPrefixOfWord("this problem is an easy problem", "pro")
        Assertions.assertEquals(result, 2)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.isPrefixOfWord("i am tired", "you")
        Assertions.assertEquals(result, -1)
    }

    @Test
    fun case4() {
        val solution = Solution()
        val result = solution.isPrefixOfWord("dumb dream duck duck i", "drea")
        Assertions.assertEquals(result, 2)
    }
}