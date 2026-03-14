//#144 - Binary Tree Preorder Traversal

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class P3PreorderTraversalHW {
    public static List<Integer> res = new ArrayList<>();
    
    public static List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return res;
    }
    
    public static void preorder(TreeNode root) {
        if(root == null) return;
        res.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(preorderTraversal(root)); // Output: [1, 2, 3]
    }
}