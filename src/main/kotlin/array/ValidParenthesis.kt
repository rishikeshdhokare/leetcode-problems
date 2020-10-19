package array

import java.lang.IllegalArgumentException

class ValidParenthesis {
    /*
    {}[]()
    {{}[]()}
     */
    fun isValid(s: String): Boolean {
        if (s.length == 1) return false
        val arr = CharArray(s.length)
        var ptr = 0
        s.forEach {
            when (it) {
                '[', '(', '{' -> arr[ptr++] = it
                else -> if (ptr == 0 || getOpeningBracket(it) != arr[--ptr]) return false
            }
        }
        return ptr==0
    }

    private fun getOpeningBracket(c: Char): Char {
        return when (c) {
            '}' -> '{'
            ']' -> '['
            ')' -> '('
            else -> throw IllegalArgumentException("no mapping found")
        }
    }
}