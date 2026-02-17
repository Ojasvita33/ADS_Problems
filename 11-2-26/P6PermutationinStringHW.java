// LeetCode #567 - Permutation in String
public class P6PermutationinStringHW {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        // Create frequency arrays for s1 and sliding window
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        
        // Fill s1 frequency
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }
        
        int windowSize = s1.length();
        
        // Sliding window of size s1.length() on s2
        for (int i = 0; i < s2.length(); i++) {
            // Add character to window
            windowCount[s2.charAt(i) - 'a']++;
            
            // Remove character from window if size exceeds s1.length()
            if (i >= windowSize) {
                windowCount[s2.charAt(i - windowSize) - 'a']--;
            }
            
            // Check if current window matches s1 permutation
            if (i >= windowSize - 1 && matches(s1Count, windowCount)) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean matches(int[] s1Count, int[] windowCount) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != windowCount[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        P6PermutationinStringHW obj = new P6PermutationinStringHW();
        
        String[][] testCases = {
            {"ab", "eidbaooo"},
            {"ab", "abab"},
            {"abc", "lecabrio"},
            {"a", "b"},
            {"aa", "aa"}
        };
        
        for (String[] test : testCases) {
            System.out.println("s1=\"" + test[0] + "\", s2=\"" + test[1] + "\" -> " + 
                             obj.checkInclusion(test[0], test[1]));
        }
    }
}
