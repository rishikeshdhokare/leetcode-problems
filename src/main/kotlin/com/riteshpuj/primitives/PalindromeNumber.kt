package com.riteshpuj.primitives

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0) return false
        var reverse = 0
        var current = x
        while(current != 0){
            reverse = current % 10 + reverse * 10
            current /= 10
        }
        return reverse == x
    }
}