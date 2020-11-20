package com.riteshpuj

import kotlin.math.max

class MaximumSubarray {
    fun approach1(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var currSum: Int
        for (windowStart in nums.indices) {
            for (windowSize in windowStart until nums.size) {
                currSum = 0
                for (i in windowStart..windowSize) {
                    currSum += nums[i]
                }
                if (currSum > max) {
                    max = currSum
                }
            }
        }
        return max
    }

    fun approach2(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var currSum: Int
        var prevSum: Int
        for (windowStart in nums.indices) {
            prevSum = 0
            for (windowSize in windowStart until nums.size) {
                currSum = prevSum + nums[windowSize]
                prevSum = currSum
                if (currSum > max) {
                    max = currSum
                }
            }
        }
        return max
    }

    fun kadeneAlgo(nums: IntArray): Int {
        var maxSum = Int.MIN_VALUE
        var currMax = 0
        for(i in nums.indices){
            currMax = max(nums[i], currMax + nums[i])
            maxSum = max(currMax, maxSum)
        }
        return maxSum
    }
}