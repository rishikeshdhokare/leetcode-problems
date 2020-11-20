package com.riteshpuj

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MaximumSubarrayTest {
    @Test
    fun `find max contiguous subarray sum`() {
        val obj = MaximumSubarray()
        assertEquals(6, obj.approach1(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(6, obj.approach2(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(6, obj.kadeneAlgo(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }
}