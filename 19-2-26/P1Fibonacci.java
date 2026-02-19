//#509 - Fibonacci Number
public class P1Fibonacci {
    public static int fib(int n) {
        // if (n <= 0) return 0;
        // if (n == 1) return 1;
        // return fib(n - 1) + fib(n - 2);
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        int ft = 0;
        int st = 1;
        for(int i = 1; i<=n; i++){
            int fibo=ft+st;
            ft=st;
            st=fibo;
        }
        return ft;
    }

    public static void main(String[] args) {
        int n = 30; // if input gets bigger it will take a long time to compute
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i));
            if (i < n - 1) System.out.print(" ");
        }
    }
}