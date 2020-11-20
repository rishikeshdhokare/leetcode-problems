package com.riteshpuj

class SearchInsertPosition {
    fun naiveSolution(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            if (nums[i] >= target) {
                return i
            }
        }
        return nums.size - 1
    }

    fun solution(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1
        var mid: Int
        while (low <= high) {
            mid = (low + high)/2
            when {
                nums[mid] == target -> return mid
                nums[mid] > target -> high = mid - 1
                else -> low = mid + 1
            }
        }
        return low
    }
}