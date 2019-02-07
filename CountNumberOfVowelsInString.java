import java.util.*;

class Solution {
    public String solution(String S) {
        // write your code in Java SE 8

        Map<Character, Character> hm = new HashMap<Character, Character>();
        int lengthOfTheString = S.length();
        int counter = 0;
        // if length of the string is one, as input string has atleast one vowel, returning 1 here.
        if (lengthOfTheString == 1) {
            return "The number of vowels in the input string - " + S + " - is " + Integer.toString(lengthOfTheString);
        }

        // if lenght of the string is more than 500, returning null, else: lenght of the string is less than 500 characters
        if (lengthOfTheString > 500) {
            return null;

        } else {
            // inserting all vowels into hashmap
            hm.put('a', 'a');
            hm.put('e', 'e');
            hm.put('i', 'i');
            hm.put('o', 'o');
            hm.put('u', 'u');

            // converting input string to lower case. make sure cover, if there are any upper case characters in the string
            S.toLowerCase();
            for (int i = 0; i < lengthOfTheString; i++) {
                if (hm.containsKey(S.charAt(i))) {
                    counter++;
                }
            }
        }
        return "The number of vowels in the input string - " + S + " - is " + Integer.toString(counter);
    }
}
