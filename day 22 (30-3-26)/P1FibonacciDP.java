//#509-Fibonacci Number

import java.util.*;

public class P1FibonacciDP {
    public  int fibonacci(int n, int[] dp) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        P1FibonacciDP obj = new P1FibonacciDP();
        System.out.println(obj.fibonacci(n, dp));
        for (int i = 0; i <= n; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}
