package two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void test() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] output1 = twoSum.twoSum1(nums, target);
        assertArrayEquals(new int[]{0, 1}, output1);

        int[] output2 = twoSum.twoSum2(nums, target);
        assertArrayEquals(new int[]{0, 1}, output2);
    }
}