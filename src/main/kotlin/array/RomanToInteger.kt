package array

import java.lang.IllegalArgumentException

class RomanToInteger {
    /*
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
     */
    fun solution(s: String): Int {
        var sum = getInt(s[0])
        var curr: Int
        var prev: Int
        for (i in 1 until s.length) {
            curr = getInt(s[i])
            prev = getInt(s[i - 1])
            if (prev < curr) {
                sum = sum - prev + getInt(s[i-1].toString() + s[i].toString())
            } else {
                sum += curr
            }
        }
        return sum
    }

    private fun getInt(c: Char): Int {
        return when (c) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> throw IllegalArgumentException("no mapping found")
        }
    }

    private fun getInt(s: String): Int {
        return when (s) {
            "IV" -> 4
            "IX" -> 9
            "XL" -> 40
            "XC" -> 90
            "CD" -> 400
            "CM" -> 900
            else -> throw IllegalArgumentException("no mapping found for $s")
        }
    }

}