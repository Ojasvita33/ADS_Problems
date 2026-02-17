//#410 - Split Array Largest Sum
public class P3SplitArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,-6,6,-7,9,1,2,0,1};
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        if(totalSum % 3 != 0){
            System.out.println(false);
            return;
        }
        int partSum = totalSum / 3;
        int currentSum = 0;
        int count = 0;
        for (int num : arr) {
            currentSum += num;
            if (currentSum == partSum) {
                count++;
                currentSum = 0;
            }
        }
        System.out.println(count >= 3);
    }    
}
