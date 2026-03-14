// #383 - Ransom Note
public class P4RamsomNote {
    public static void main(String[] args) {
        // Test cases
        String[][] testCases = {
            {"a", "b"},
            {"aa", "ab"},
            {"aa", "aab"},
            {"hello", "oellh"},
            {"hello", "world"}
        };
        for (String[] testCase : testCases) {
            System.out.println(canConstruct(testCase[0], testCase[1]));
        }
    }   
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }
        return true;
    }
}
