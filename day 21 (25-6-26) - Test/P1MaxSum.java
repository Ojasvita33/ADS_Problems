/*Q1: Maximum Subarray Sum (Kadane’s Algorithm)
Description: Given an integer array, find the contiguous subarray (containing at least one element)
which has the largest sum. You are required to solve this problem using an optimized approach with
linear time complexity O(n). Brute force solutions will not be considered efficient.
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The subarray [4, -1, 2, 1] gives the maximum sum = 6. Kadane’s algorithm works by
maintaining a running sum and updating the maximum sum whenever a better value is found. */

class P1MaxSum {
    public static void main(String[] args){
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = a[0];
        int maxSum = a[0];
        for(int i=1; i<a.length; i++){
            currentSum = Math.max(currentSum + a[i], a[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Maximum sum: " + maxSum);
    }
}
