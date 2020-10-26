package com.riteshpuj

import java.lang.IllegalArgumentException

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        if (nums.size == 2) return intArrayOf(0, 1)
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val key = target - nums[i]
            if (map.containsKey(key)) {
                return intArrayOf(i, map[key]!!)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("no solution found")
    }
}
