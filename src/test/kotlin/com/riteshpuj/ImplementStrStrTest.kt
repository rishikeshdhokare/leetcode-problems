package com.riteshpuj

import com.riteshpuj.ImplementStrStr
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ImplementStrStrTest {
    @Test
    fun `should find a str within a str`() {
        val o = ImplementStrStr()
        assertEquals(4, o.strStr("aabaaabaaac", "aabaaac"))
        assertEquals(4, o.strStr("mississippi", "issip"))
        assertEquals(8, o.strStr("This is a haystack", "a "))
        assertEquals(2, o.strStr("This is a haystack", "i"))
        assertEquals(0, o.strStr("mississippi", ""))
        assertEquals(-1, o.strStr("mississippi", "missD"))
    }
}