// Question 2 (Medium): Variable Size Sliding Window
// Given an array of positive integers and an integer K, find the length of the smallest subarray whose
// sum is greater than or equal to K.
// Input:
// arr = [2, 3, 1, 2, 4, 3]
// K = 7
// Output:
// Smallest subarray length
// Hint: Expand window using right pointer and shrink using left pointer.

public class P5VariableSizeSlidingWindowHW {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int K = 7;
        int minLength = findMinLength(arr, K);
        System.out.println("Smallest subarray length with sum at least " + K + " is: " + minLength);
    }

    public static int findMinLength(int[] arr, int K) {
        int n = arr.length;
        int left = 0; 
        int sum = 0; 
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum >= K) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}   