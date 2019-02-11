import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, List<String>> hm = new HashMap<String, List<String>>();

        for (int i = 0; i < strs.length; i++) {
            String sorted = sortedString(strs[i]);
            List<String> list = null;
            if (hm.containsKey(sorted)) {
                list = hm.get(sorted);
            } else {
                list = new ArrayList<>();
            }
            list.add(strs[i]);
            hm.put(sorted, list);
        }
        for (List<String> list : hm.values()) {
            result.add(list);
        }
        return result;
    }

    private String sortedString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}
