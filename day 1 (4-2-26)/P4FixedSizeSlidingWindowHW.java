// Question 1 (Easy): Fixed Size Sliding Window
// Given an integer array and an integer K, find the maximum average of any subarray of size K.
// Input:
// arr = [1, 12, -5, -6, 50, 3]
// K = 4
// Output:
// Maximum average subarray value
// Hint: Use fixed size sliding window.

public class P4FixedSizeSlidingWindowHW {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int K = 4;
        double maxAverage = findMaxAverage(arr, K);
        System.out.println("Maximum average subarray value: " + maxAverage);
    }

    public static double findMaxAverage(int[] arr, int K) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        for (int i = K; i < n; i++) {
            sum += arr[i] - arr[i - K];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return (double) maxSum / K;
    }
}
