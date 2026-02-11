public class P1isPlaindrome {
    public static boolean isPalindrome(String s) {
    int l = 0;
    int r = s.length() - 1;

    while (l < r) {
      while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
        ++l;
      while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
        --r;
      if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
        return false;
      ++l;
      --r;
    }
    return true;
  }
  public static void main(String[] args) {
        // Test cases
        String[] testCases = {
            "A man, a plan, a canal, Panama",
            "racecar",
            "hello",
            "race a car"
        };
        
        for (String testCase : testCases) {
            System.out.println("\"" + testCase + "\" -> " + isPalindrome(testCase));
        }
    }
}
