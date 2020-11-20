package com.riteshpuj.primitives

import com.riteshpuj.primitives.PalindromeNumber
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class PalindromeNumberTest {
    @Test
    fun `check if number is Palindrome`() {
        Assertions.assertThat(PalindromeNumber().isPalindrome(121)).isEqualTo(true)
        Assertions.assertThat(PalindromeNumber().isPalindrome(-121)).isEqualTo(false)
        Assertions.assertThat(PalindromeNumber().isPalindrome(10)).isEqualTo(false)
        Assertions.assertThat(PalindromeNumber().isPalindrome(-10)).isEqualTo(false)
        Assertions.assertThat(PalindromeNumber().isPalindrome(-1)).isEqualTo(false)
        Assertions.assertThat(PalindromeNumber().isPalindrome(-101)).isEqualTo(false)
        Assertions.assertThat(PalindromeNumber().isPalindrome(0)).isEqualTo(true)
        Assertions.assertThat(PalindromeNumber().isPalindrome(Int.MIN_VALUE)).isEqualTo(false)
        Assertions.assertThat(PalindromeNumber().isPalindrome(Int.MAX_VALUE)).isEqualTo(false)
    }
}