package app.kevinle.leetcodekotlin.p1455

/**
 * Created by Kevin Le on 2024/11/3.
 */
class Solution {
    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
        var indexOfWord = 1
        var searchPointer = 0
        var skipThisWord = false
        for (i in sentence.indices) {
            val c = sentence[i]
            if (' ' == c) {
                indexOfWord++
                skipThisWord = false
                searchPointer = 0
                continue
            }

            if (skipThisWord) {
                continue
            }

            if (c == searchWord[searchPointer]) {
                searchPointer++
                if (searchPointer == searchWord.length) {
                    return indexOfWord
                }

                continue
            }

            skipThisWord = true
        }

        return -1
    }
}