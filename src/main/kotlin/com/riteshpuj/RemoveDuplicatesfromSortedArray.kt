package com.riteshpuj

class RemoveDuplicatesfromSortedArray {
    /*
        1, 1, 1, 2, 3
        second = 0, 1, 2
        first = 0, 1, 2, 3
        1, 2, 3
        1, 2, 1, 1
        1, 2, 3, 3
        1, 2, 2, 3
        1, 1, 1, 1
     */
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 1) return nums.size
        var second = 0
        for (first in 0..nums.size - 2) {
            if (nums[first] != nums[first + 1]) {
                nums[second++] = nums[first]
            }
        }
        nums[second++] = nums[nums.size - 1]
        return second
    }


}