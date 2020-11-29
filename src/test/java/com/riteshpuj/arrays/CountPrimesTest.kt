package com.riteshpuj.arrays

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CountPrimesTest {
    @Test
    fun `count primes until given number`() {
        val countPrimes = CountPrimes()
        Assertions.assertThat(countPrimes.sieveOfEratosthenes(1)).isEqualTo(0)
        Assertions.assertThat(countPrimes.sieveOfEratosthenes(0)).isEqualTo(0)
        Assertions.assertThat(countPrimes.sieveOfEratosthenes(10)).isEqualTo(4)
        Assertions.assertThat(countPrimes.sieveOfEratosthenes(499979)).isEqualTo(41537)
    }
}