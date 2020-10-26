package com.riteshpuj

class ReverseInteger {
    fun reverse(x: Int): Int {
        /*
        123/10 = 12.3
        123%10 = 3
        Take Mod
        3
        Divide the number
        12
        Mod 2
        Div 1
        Mod 1
        Div 0
         */
        if (x / 10 == 0) return x
        var y: Long = x.toLong()
        var output: Long = 0
        while (y != 0L) {
            output = output * 10 + y % 10
            y /= 10
        }
        return if (output > Int.MAX_VALUE || output < Int.MIN_VALUE) {
            0
        } else {
            output.toInt()
        }
    }
}