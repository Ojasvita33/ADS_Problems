// LeetCode #680 - Valid Palindrome II
public class P5ValidPaindrome2HW {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                // Mismatch found. Check both possibilities:
                // 1. Skip the left character
                // 2. Skip the right character
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        
        // If the loop completes, the string is already a palindrome (zero deletions needed)
        return true;
    }

    // Helper function to check if a substring is a palindrome
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                // If a second mismatch is found, it's not a valid palindrome with one deletion
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        P5ValidPaindrome2HW obj = new P5ValidPaindrome2HW();
        
        String[] testCases = {
            "aba",
            "abca",
            "abc",
            "racecar",
            "abcda",
            "a"
        };
        
        for (String test : testCases) {
            System.out.println("\"" + test + "\" -> " + obj.validPalindrome(test));
        }
    }
}

