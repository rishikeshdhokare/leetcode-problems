package com.riteshpuj.arrays

class RotateImage {
    fun solution(matrix: Array<IntArray>) {
        // Step 1: Transpose the matrix
        // https://en.wikipedia.org/wiki/Transpose
        var temp: Int
        for (row in matrix.indices) {
            for (col in row until matrix[row].size) {
                temp = matrix[row][col]
                matrix[row][col] = matrix[col][row]
                matrix[col][row] = temp
            }
        }
        // Step 2: Flip it horizontally
        // to prevent from same element getting swapped again
        val limit = if (matrix.size % 2 == 0) matrix.size / 2 - 1 else matrix.size / 2
        for (row in matrix.indices) {
            for (col in 0..limit) {
                temp = matrix[row][col]
                // first col <-> last col
                // second col <-> second last col
                // hence the formula "matrix.size - 1 - col"
                matrix[row][col] = matrix[row][matrix.size - 1 - col]
                matrix[row][matrix.size - 1 - col] = temp
            }
        }
    }

    private fun solutionUsingExtraSpace(matrix: Array<IntArray>) {
        var row = 0
        var col = matrix[0].size - 1
        val output = Array(matrix.size) { IntArray(matrix[0].size) }
        for (irow in matrix) {
            for (icol in irow) {
                output[row++][col] = icol
            }
            row = 0
            col--
        }
    }
}