/*Q3: Longest Substring Without Repeating Characters
Description: Given a string, determine the length of the longest substring without repeating
characters. The solution must be implemented using the sliding window technique with two pointers
to achieve optimal O(n) time complexity.
Input: abcabcbb
Output: 3
Explanation: The substring 'abc' is the longest substring without repeating characters. The sliding
window expands when characters are unique and shrinks when duplicates are encountered. */
import java.util.*;
class P3LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLen = 0;
        int l = 0;
        HashSet<Character> set = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }
        System.out.println("Maximum length of substring without repeating characters: " + maxLen);
    }
}