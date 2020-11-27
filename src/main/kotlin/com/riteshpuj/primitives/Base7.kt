package com.riteshpuj.primitives

class Base7 {
    fun solution(num: Int): String {
        val output = StringBuilder()
        var n = num
        while (n != 0) {
            output.append(n % 7)
            n /= 7
        }
        if(num < 0) {
            output.replace(Regex("/-/"), "")
            output.append("-")
        }
        return output.reverse().toString()
    }
}