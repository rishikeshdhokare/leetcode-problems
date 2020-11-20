package com.riteshpuj.primitives

import kotlin.math.absoluteValue

class PowerOfTwo {
    fun solution(n: Int): Boolean {
        n and n - 1
        if (n <= 0) return false
        var lastValue = n
        while (lastValue != 1) {
            if (lastValue % 2 != 0) {
                return false
            }
            lastValue /= 2
        }
        return true
    }

}