package com.riteshpuj.primitives

import java.lang.RuntimeException
import java.lang.StringBuilder

class AddStrings {
    fun approach1(num1: String, num2: String): String {
        return (num1.toInt() + num2.toInt()).toString()
    }


    fun approach3(num1: String, num2: String): String {
        val num1Int = Integer.parseInt(num1)
        val num2Int = Integer.parseInt(num2)
        return (num1Int + num2Int).toString()
    }

    fun approach2(num1: String, num2: String): String {
        return (convertToInt(num1) + convertToInt(num2)).toString()
    }

    fun convertToInt(num: String): Int {
        var output = 0
        for (c in num) {
            output = (output * 10) + getIntValue(c)
        }
        return output
    }

    fun approach4(num1: String, num2: String): String {
        val output = StringBuilder()
        var m = num1.length - 1
        var n = num2.length - 1
        var sum: Int
        var carry = 0
        while (m > -1 && n > -1) {
            sum = carry + getIntValue(num1[m]) + getIntValue(num2[n])
            carry = getCarry(sum)
            m--
            n--
            output.append(sum % 10)
        }
        while (m > -1) {
            sum = carry + getIntValue(num1[m])
            carry = getCarry(sum)
            m--
            output.append(sum % 10)
        }
        while (n > -1) {
            sum = carry + getIntValue(num2[n])
            carry = getCarry(sum)
            n--
            output.append(sum % 10)
        }
        if (carry > 0) output.append(carry)
        return output.reverse().toString()
    }

    private fun getCarry(sum: Int): Int {
        return if(sum > 9) 1 else 0
    }

    fun getIntValue(c: Char): Int {
        return when (c) {
            '0' -> 0
            '1' -> 1
            '2' -> 2
            '3' -> 3
            '4' -> 4
            '5' -> 5
            '6' -> 6
            '7' -> 7
            '8' -> 8
            '9' -> 9
            else -> throw RuntimeException()
        }
    }
}

fun main() {
    println('0'.toInt())
}