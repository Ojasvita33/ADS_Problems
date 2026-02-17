// #28 - Find the Index of the First Occurrence in a String
public class KMP {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack;
        String needle;

        if (args.length >= 2) {
            haystack = args[0];
            needle = args[1];
        } else {
            haystack = "hello";
            needle = "ll";
        }

        KMP k = new KMP();
        int idx = k.strStr(haystack, needle);
        System.out.println(idx);
    }
}