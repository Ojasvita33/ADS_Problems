//#700 - Search in a Binary Search Tree
public class P1SearchInBST {
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int target = 2; 
        TreeNode result = searchInBST(root, target);
        if (result != null) {
            System.out.println("Target " + target + " Found! Returned node value: " + result.val);
        } else {
            System.out.println("Target " + target + " Not Found! Returned null.");
        }
    }

    public static TreeNode searchInBST(TreeNode root, int val) {
        //root.val == target --> return root
        //if target < root.val --> left side jana h
        //if target > root.val --> right side 

        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchInBST(root.left, val);
        } else {
            return searchInBST(root.right, val);
        }
    }
}