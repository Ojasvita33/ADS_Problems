public class P1MaxSubArray {
    //array={2,1,3,5,9,3,2};
    //k=3;
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 9, 3, 2};
        int k = 3;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for (int right = k; right < arr.length; right++) {
            windowSum += arr[right];
            windowSum -= arr[right - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}