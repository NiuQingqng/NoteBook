package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * No.1  两数之和
 *
 * @author Niuniu
 * @date 2024/1/4
 */
public class No1TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] res = twoSumMap(nums, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) continue;
                if (nums[i] + nums[j] == target)   return new int[]{i, j};
            }
        }
        return null;
    }

    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer no = map.get(target - nums[i]);
            if (no != null) {
                return new int[]{no, i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
