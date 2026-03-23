//#108 - Convert Sorted Array to Binary Search Tree
public class P8SortedArrtoBSTHW {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums ,0 , nums.length -1);
    }

    public static TreeNode helper(int[] nums, int low, int high){
        if(low > high) return null;
        int mid = low + (high-low)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, low, mid-1);
        root.right = helper(nums, mid+1, high);
        return root;
    }
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        @SuppressWarnings("unused")
        TreeNode root = sortedArrayToBST(nums); 
    }
}