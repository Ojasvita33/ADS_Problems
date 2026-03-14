//#1524 - Subarray with Odd Sum
public class P4SubArraywithOddSum {
    public static int numOfSubarrays(int[] arr) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum % 2 != 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[][] testCases = {
            {1, 3, 5},
            {2, 4, 6},
            {1, 2, 3, 4, 5},
            {1},
            {2, 3}
        };
        
        for (int[] arr : testCases) {
            System.out.print("Array: ");
            for (int num : arr) System.out.print(num + " ");
            System.out.println("-> Count of odd sum subarrays: " + numOfSubarrays(arr));
        }
    }
}
