public class P3ValidAnagram {
    public static void main(String[] args) {
        // Test cases
        String[][] testCases = {
            {"listen", "silent"},
            {"triangle", "integral"},
            {"apple", "pabble"},
            {"rat", "car"}
        };
        for (String[] testCase : testCases) {
            System.out.println(isAnagram(testCase[0], testCase[1]));
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26];
        for(char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        for(char c : s2.toCharArray()) {
            count[c - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
