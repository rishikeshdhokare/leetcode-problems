package com.riteshpuj.primitives

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AddStringsTest {
    @Test
    fun `return addition of the numbers represented as String`() {
        val obj = AddStrings()
        assertEquals("20", obj.approach1("10", "10"))
        assertEquals("10", obj.approach1("10", "0"))
        assertEquals("10", obj.approach1("0", "10"))
        assertEquals("0", obj.approach1("0", "0"))
        assertEquals("100", obj.approach1("99", "1"))
        assertEquals("20", obj.approach2("10", "10"))
        assertEquals("10", obj.approach2("10", "0"))
        assertEquals("10", obj.approach2("0", "10"))
        assertEquals("0", obj.approach2("0", "0"))
        assertEquals("100", obj.approach2("99", "1"))
        assertEquals("20", obj.approach3("10", "10"))
        assertEquals("10", obj.approach3("10", "0"))
        assertEquals("10", obj.approach3("0", "10"))
        assertEquals("0", obj.approach3("0", "0"))
        assertEquals("100", obj.approach3("99", "1"))
        assertEquals("20", obj.approach4("10", "10"))
        assertEquals("10", obj.approach4("10", "0"))
        assertEquals("10", obj.approach4("0", "10"))
        assertEquals("0", obj.approach4("0", "0"))
        assertEquals("100", obj.approach4("99", "1"))
    }
}