package com.riteshpuj

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var first = 0
        for (second in nums.indices) {
            if (nums[second] != `val`) {
                nums[first++] = nums[second]
            }
        }
        return first
    }
}