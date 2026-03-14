//#231 - Power of Two
public class P2PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n<=0 || n%2!=0 ) return false;
        return isPowerOfTwo(n/2);
        
        // if(n < 1){
        //     return false;
        // }
        // else if(n == 1){
        //     return true;
        // }
        // else{
        //     while(n % 2 == 0){
        //         n = n/2;
        //     }

        //     if(n==1){
        //         return true;
        //     }
        //     else{
        //         return false;
        //     }
        // }
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
}
