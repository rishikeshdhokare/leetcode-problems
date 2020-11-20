package com.riteshpuj.primitives

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PowerOfTwoTest {
    @Test
    fun `return true if the number is power of two`() {
        val obj = PowerOfTwo()
        assertEquals(true, obj.solution(4))
        assertEquals(false, obj.solution(-4))
        assertEquals(false, obj.solution(-8))
        assertEquals(false, obj.solution(-16))
        assertEquals(false, obj.solution(0))
        assertEquals(false, obj.solution(5))
    }
}