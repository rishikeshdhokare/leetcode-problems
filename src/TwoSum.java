import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println("Attempt 1:");
        int[] result1 = twoSum1(nums, target);
        System.out.println(Arrays.toString(result1));

        System.out.println("Attempt 1:");
        int[] result2 = twoSum2(nums, target);
        System.out.println(Arrays.toString(result2));
    }

    // Attempt 1: O(n2)
    private static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[j] == nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // Attempt 2: O(n)
    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.get(complement) != null) {
                return new int[]{numsMap.get(complement), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
