import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class DistinctPairs {
    public void subarraySum(int[] nums, int k) {

        int nums[] = {1, 2, 3, 4, 5, 6};
        int k = 7;
        Set<Integer> set = new HashSet<Integer>();

        for (int value : nums) {
            int target = k - value;

            if (!set.contains(target)) {
                set.add(value);
            } else {
                System.out.printf("(%d, %d) %n", value, target);

            }
        }
    }
}
