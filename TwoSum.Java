import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (hm.containsKey(value)) {
                return new int[]{hm.get(value), i};
            } else {
                hm.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
