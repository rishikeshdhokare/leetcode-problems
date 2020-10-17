package array

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TwoSumTest {
    @Test
    fun `should return indices of array whose sum is equal to target`() {
        Assertions.assertThat(TwoSum().twoSum(intArrayOf(-1,-2,-3,-4,-5), -8)).containsExactlyInAnyOrder(2, 4)
        Assertions.assertThat(TwoSum().twoSum(intArrayOf(11, 15, 2, 7), 9)).containsExactlyInAnyOrder(2, 3)
        Assertions.assertThat(TwoSum().twoSum(intArrayOf(3, 2, 4), 6)).containsExactlyInAnyOrder(1, 2)
        Assertions.assertThat(TwoSum().twoSum(intArrayOf(3, 3), 6)).containsExactlyInAnyOrder(0, 1)
        Assertions.assertThat(TwoSum().twoSum(intArrayOf(0, 1, 0), 0)).containsExactlyInAnyOrder(0, 2)
        Assertions.assertThat(TwoSum().twoSum(intArrayOf(-1, 0, 1, 2), -1)).containsExactlyInAnyOrder(0, 1)
        Assertions.assertThat(TwoSum().twoSum(intArrayOf(-1, 0, 1, 2), 0)).containsExactlyInAnyOrder(0, 2)
    }
}
