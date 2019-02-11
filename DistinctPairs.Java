import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class DistinctPairs {
    public void subarraySum(int[] nums, int sum) {

        int nums[] = {1, 2, 3, 4, 5, 6};
        int k = sum;
        Set<Integer> set = new HashSet<Integer>();
   
        for (int value : nums) {
            int target = k - value;

            if (!set.contains(target)) {
                set.add(value);
            } else {
            Pair<Integer, Integer> p = new Pair(value,target);
            System.out.println(p);

            }
        }
    }
}
