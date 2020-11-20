package com.riteshpuj.primitives

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MinimumTimeDifferenceTest {
    @Test
    fun `return minimum time difference between any two time points`() {
        val obj = MinimumTimeDifference()
        assertEquals(2, obj.solution(listOf("14:01", "14:16", "13:59")))
        assertEquals(1, obj.solution(listOf("01:00","00:59")))
        assertEquals(719, obj.solution(listOf("12:12","00:13")))
        assertEquals(15, obj.solution(listOf("14:01", "14:16")))
        assertEquals(0, obj.solution(listOf("00:00","23:59","00:00")))
        assertEquals(1, obj.solution(listOf("00:00","23:59")))
        assertEquals(147, obj.solution(listOf("05:31","22:08","00:35")))
        assertEquals(236, obj.solution(listOf("01:39","10:26","21:43")))
    }
}