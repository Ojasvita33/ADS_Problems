//#39 - Combination Sum
import java.util.*;
public class P5CombinationSumWithDuplicateHW {
    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(arr, target, 0, new ArrayList<>(), res);
        return res;
    }
    public static void backtrack(int[] arr, int l, int start, List<Integer> curr, List<List<Integer>> res) 
    {
        if (l == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if (l < 0) {
            return;
        }
        for (int i = start; i < arr.length; i++) {
            int candidate = arr[i];
            curr.add(candidate);
            backtrack(arr, l - candidate, i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        System.out.println(combinationSum(arr, 7));
    }
}
