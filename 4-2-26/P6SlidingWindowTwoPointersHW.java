// Question 3 (Hard): Sliding Window + Two Pointers
// Given a string, find the length of the longest substring that contains at most K distinct characters.
// Input:
// String = "eceba"
// K = 2
// Output:
// Length of the longest valid substring
// Hint: Use sliding window with a frequency map.

import java.util.*;
public class P6SlidingWindowTwoPointersHW {
    public static void main(String[] args) {
        String s = "eceba";
        int K = 2;
        int longestLength = findLongestSubstring(s, K);
        System.out.println("Length of the longest substring with at most " + K + " distinct characters: " + longestLength);
    }

    public static int findLongestSubstring(String s, int K) {
        int n = s.length();
        if (n == 0 || K == 0) return 0;

        int left = 0, right = 0;
        int maxLength = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        while (right < n) {
            char c = s.charAt(right);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

            while (charCount.size() > K) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
