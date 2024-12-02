package app.kevinle.leetcodekotlin.p67

/**
 * Created by Kevin Le on 2024/12/2.
 */
class Solution {
    fun addBinary(a: String, b: String): String {
        var carry = false
        var pointerA = 0
        var pointerB = 0
        val sb = StringBuilder()

        while (pointerA < a.length && pointerB < b.length) {
            val binaryA = a[a.length - 1 - pointerA]
            val binaryB = b[b.length - 1 - pointerB]

            if (binaryA == binaryB) {
                if (binaryA == '0') {
                    sb.append(if (carry) '1' else '0')
                    carry = false
                } else {
                    sb.append(if (carry) '1' else '0')
                    carry = true
                }
            } else {
                sb.append(if (carry) '0' else '1')
            }

            pointerA++
            pointerB++
        }

        while (pointerA < a.length) {
            val binaryA = a[a.length - 1 - pointerA]
            if (carry) {
                if (binaryA == '0') {
                    carry = false
                    sb.append('1')
                } else {
                    sb.append('0')
                }
            } else {
                sb.append(binaryA)
            }

            pointerA++
        }

        while (pointerB < b.length) {
            val binaryB = b[b.length - 1 - pointerB]
            if (carry) {
                if (binaryB == '0') {
                    carry = false
                    sb.append('1')
                } else {
                    sb.append('0')
                }
            } else {
                sb.append(binaryB)
            }

            pointerB++
        }

        if (carry) {
            sb.append('1')
        }

        return sb.reverse().toString()
    }
}