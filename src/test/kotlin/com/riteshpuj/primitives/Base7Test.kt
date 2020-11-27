package com.riteshpuj.primitives

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Base7Test {
    @Test
    fun `should return base 7`() {
        val b = Base7()
        assertEquals("-10", b.solution(-7))
        assertEquals("202", b.solution(100))
    }
}