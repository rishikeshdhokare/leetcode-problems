package com.riteshpuj

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SearchInsertPositionTest {
    @Test
    fun `search insert position`() {
        val obj = SearchInsertPosition()
        assertEquals(3, obj.solution(intArrayOf(-3, -2, 0, 2), 1))
        assertEquals(2, obj.solution(intArrayOf(-3, -2, 0, 2), -1))
        assertEquals(2, obj.solution(intArrayOf(-3, -2, 0, 2), 0))
        assertEquals(0, obj.solution(intArrayOf(-3, -2, 0, 2), -4))
        assertEquals(4, obj.solution(intArrayOf(-3, -2, 0, 2), 5))
        assertEquals(4, obj.solution(intArrayOf(1,3,5,6), 7))
    }
}