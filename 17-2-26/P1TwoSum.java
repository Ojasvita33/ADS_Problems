import java.util.*;
// LeetCode #1 - Two Sum
public class P1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2, 7, 11, 15};
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
