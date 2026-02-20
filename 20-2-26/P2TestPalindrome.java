// 2. Write a recursive function to check if a sing is palindrome without using extra space. Explain call stack behavior. 
public class P2TestPalindrome {
    public static void main(String[] args) {
        String s = "naman";
        System.out.println(isPal(s, 0, s.length() - 1));
    }
    public static boolean isPal(String s, int l, int r) {
        if (l >= r) {
            return true; 
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false; 
        }
        return isPal(s, l + 1, r - 1);
    }
}
/*Call stack behaviour: 
s = "naman", l = 0, r = 4
isPal("naman", 0, 4) ; checks 'n' and 'n' => true 
isPal("naman", 1, 3) ; checks 'a' and 'a' => true 
isPal("naman", 2, 2) ; l >= r => true (Base Case true) ; returns true to last call
isPal("naman", 1, 3) ; returns true from isPal("naman", 2, 2) => returns true to last call
isPal("naman", 0, 4) ; receives true from isPal("naman", 1, 3) => returns true to main
prints true
*/