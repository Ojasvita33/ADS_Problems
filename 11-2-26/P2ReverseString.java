// LeetCode #344 - Reverse String
public class P2ReverseString {
    public static void main(String[] args) {
        // Test cases
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        
        reverseString(s1);
        reverseString(s2);
        
        System.out.println(s1);
        System.out.println(s2);
    }
    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;
        }
    }
}
