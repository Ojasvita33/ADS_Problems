// LeetCode #5 - Longest Palindromic Substring

public class P1LPS {
    public static void main(String[] args) {
        String str = "ababaca";
        int[] lps = lps(str);
        for (int i : lps) {
            System.out.print(i + " ");
        }

    }
    public static int[] lps(String pat) {
        int n = pat.length();
        int[] lps = new int[n];
        lps[0] = 0;
        int i = 1;
        int len = 0;
        while (i < n) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}