public class P2CircularArrayMaxSum {
    public static void main(String[] args) {
        int[] arr = { 8, -1, 3, 4 };
        int totalSum = 0;
        int maxSum = arr[0], currentMax = arr[0];
        int minSum = arr[0], currentMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            if (i > 0) {
                currentMax = Math.max(currentMax + arr[i], arr[i]);
                maxSum = Math.max(maxSum, currentMax);
                currentMin = Math.min(currentMin + arr[i], arr[i]);
                minSum = Math.min(minSum, currentMin);
            }
        }
        if (maxSum < 0) {
            System.out.println(maxSum);
            return;
        }
        int circularSum = totalSum - minSum;
        System.out.println(Math.max(maxSum, circularSum));
    }
}
