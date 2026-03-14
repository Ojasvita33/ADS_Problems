// 1. Given an integer array, find the length of the longest subarray with sum exactly K. Explain your approach and dry run with example.
import java.util.*;
public class P1TestLongestSubarrayWithKSum {

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int K = 3;
        System.out.println(LSS(arr, K));
    }

    public static int LSS(int[] arr, int K) {
        HashMap<Integer, Integer> smap = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == K)
                maxlen = i + 1; 

            if (smap.containsKey(sum - K)) {
                int n = i - smap.get(sum - K);    
                maxlen = Math.max(maxlen, n);
            }
            if (!smap.containsKey(sum)) {
                smap.put(sum, i);
            }
        }
        return maxlen;
    }
}

/*Code explanation: Used prefix sum with hashmap to store sum and its index. We will iterate the array and keep adding elements to sum. If (sum == k) then we will update maxlen with (current index + 1) . If (sum - k) is present in the map then we calculate length of subarray from index of (sum-k) to current index and update maxlen if it is greater. Then return maxlen.
 */
/*Dry run example:
array: [1, -1, 5, -2, 3], K = 3
i=0: map={1:0};  sum=1 at index 0; 1==3 => false ; 1-3 = -2 not in map;
i=1: map={1:0, 0:1} ; sum=0 at index 1; 0==3 => false ; 0-3=-3 not in map; 
i=2: map={1:0, 0:1, 5:2} ; sum=5 at index 2; 5==3 => false ; 5-3=2 not in map;
i=3: map={1:0, 0:1, 5:2, 3:3} ; sum=3 at index 3; 3==3 => true => maxlen = 4; 3-3=0 is in map at index 1 => n = 3-1 = 2 => maxlen = max(4,2) = 4;
i=4: map={1:0, 0:1, 5:2, 3:3, 6:4} ; sum=6 at index 4; 6==3 => false ; 6-3=3 is in map at index 3 => n = 4-3 = 1 
=> maxlen = max(4,1) = 4;
return maxlen=4
 */