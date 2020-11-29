package com.riteshpuj.arrays

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RotateImageTest {

    val rotateImage = RotateImage()

    @Test
    fun `rotate 2d 3x3 matrix`() {
        val input = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        rotateImage.solution(input)
        Assertions.assertThat(input).isEqualTo(
            arrayOf(
                intArrayOf(7, 4, 1),
                intArrayOf(8, 5, 2),
                intArrayOf(9, 6, 3)
            )
        )
    }

    @Test
    fun `rotate 2d 4x4 matrix`() {
        val input = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(4, 5, 6, 7),
            intArrayOf(8, 9, 10, 11),
            intArrayOf(12, 13, 14, 15)
        )
        rotateImage.solution(input)
        Assertions.assertThat(input).isEqualTo(
            arrayOf(
                intArrayOf(12, 8, 4, 1),
                intArrayOf(13, 9, 5, 2),
                intArrayOf(14, 10, 6, 3),
                intArrayOf(15, 11, 7, 4)
            )
        )
    }
}