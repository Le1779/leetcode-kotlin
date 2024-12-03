package app.kevinle.leetcodekotlin.p190

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/12/2.
 */
class SolutionTest {
    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.reverseBits(0b00000010100101000001111010011100)
        Assertions.assertEquals(result, 964176192)
    }
}