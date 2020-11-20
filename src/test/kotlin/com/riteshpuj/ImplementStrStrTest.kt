package com.riteshpuj

import com.riteshpuj.ImplementStrStr
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ImplementStrStrTest {
    @Test
    fun `should find a str within a str`() {
        val o = ImplementStrStr()
        assertEquals(4, o.str22("aabaaabaaac", "aabaaac"))
        assertEquals(4, o.str22("mississippi", "issip"))
        assertEquals(8, o.str22("This is a haystack", "a "))
        assertEquals(2, o.str22("This is a haystack", "i"))
        assertEquals(0, o.str22("mississippi", ""))
        assertEquals(-1, o.str22("mississippi", "missD"))
    }
}