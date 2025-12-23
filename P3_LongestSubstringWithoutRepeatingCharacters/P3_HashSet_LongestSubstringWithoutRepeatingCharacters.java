package P3_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class P3_HashSet_LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        for(int right = 0; right<s.length(); right++){
            char c = s.charAt(right);
            if(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            max_len = Math.max(max_len , right-left+1);
        }
        return max_len;
    }
    public static void main(String args[]){

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
