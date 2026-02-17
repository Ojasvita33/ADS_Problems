// LeetCode #53 - Maximum Subarray (Kadane's Algorithm)
public class P1Kadane {
    public static void main(String[] args) {
        int[] arr = {2,4,6,-5,8,9,10};
        int currentSum = arr[0];
        int maxSum = arr[0];
        for(int i=1; i<arr.length; i++){
            currentSum = Math.max(currentSum+arr[i], arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }        
        System.out.println(maxSum);
    }    
}
