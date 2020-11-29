package com.riteshpuj.arrays

import kotlin.math.sqrt

class CountPrimes {

    fun sieveOfEratosthenes(n: Int): Int {
        if(n < 2) return 0
        val notPrime = BooleanArray(n)
        var count = 0
        for (i in 2 until n) {
            if(!notPrime[i]) {
                count++
                for (j in i + i until n step i) {
                    if(!notPrime[j]) {
                        notPrime[j] = true
                    }
                }
            }
        }
//        println(numArray.contentToString())
        return count
    }

    fun solution(n: Int): Int {
        var num = n - 1
        var count = 0
        while (num > 1) {
            if (isPrime(num)) {
//                print("$num ,")
                count++
            }
            num--
        }
        return count
    }

    private fun isPrime(num: Int): Boolean {
        for (divisor in 2..sqrt(num.toDouble()).toInt()) {
            if (num % divisor == 0) {
                return false
            }
        }
        return true
    }

}