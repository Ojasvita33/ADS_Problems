//#70 - Climbing Stairs

public class P1ClimbingStairs {
    public static int climb(int n){
        //if we are at n step
        //n-1
        //n-2
        if(n<=2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climb(n));
    }
}

//dp[1] = 1
//dp[2] = 2
//dp[3] = 2+1 = 3
//dp[4] = 3+2 = 5
//dp[5] = 5+3 = 8 ...