package com.riteshpuj.primitives

import kotlin.math.min

class MinimumTimeDifference {
    fun solution(timePoints: List<String>): Int {
        val minutesSeen = BooleanArray(1440) //because there are 1440 mins in 24 hours
        // counting sort
        for (t in timePoints) {
            val timeSplit = t.split(":")
            val minutes = timeSplit[0].toInt() * 60 + timeSplit[1].toInt()
            if (minutesSeen[minutes]) return 0
            minutesSeen[minutes] = true
        }
        var minimumDifference = Int.MAX_VALUE
        var prev = -1
        var first = -1
        for (curr in minutesSeen.indices) {
            if (minutesSeen[curr]) {
                if (prev == -1) {
                    first = curr
                    prev = curr
                } else {
                    minimumDifference = min(
                        curr - prev, //clockwise time difference,
                        minimumDifference
                    )
                    prev = curr
                }
            }
        }
        val list = listOf<String>()

        //make sure first is compared with last to cover all the groups in the minutes array
        return min(
            minimumDifference,
            min(
                prev - first,
                1440 - prev + first
            )
        )
    }

    fun quickSort(low: Int, high: Int, minutes: MutableList<Int>) {
        if (low < high) {
            val pivot = partition(low, high, minutes)
            println(minutes)
            quickSort(low, pivot - 1, minutes)
            quickSort(pivot + 1, high, minutes)
        }
    }

    private fun partition(low: Int, high: Int, minutes: MutableList<Int>): Int {
        val pivot = minutes[low]
        var a = low + 1
        var b = high
        while (a <= b) {
            if (minutes[a] <= pivot) {
                a++
            }
            if (minutes[b] >= pivot) {
                b--
            }
            if (a < b && minutes[a] > minutes[b]) {
                swap(a, b, minutes)
            }
        }
        swap(b, low, minutes)
        return b
    }

    private fun swap(a: Int, b: Int, minutes: MutableList<Int>) {
        val temp = minutes[a]
        minutes[a] = minutes[b]
        minutes[b] = temp
    }
}