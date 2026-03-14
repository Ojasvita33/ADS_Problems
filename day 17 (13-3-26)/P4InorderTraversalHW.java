//#94 - Binary Tree Inorder Traversal

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

public class P4InorderTraversalHW {
    public static List<Integer> res = new ArrayList<>();
    
    public static List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
    }
    
    public static void inorder(TreeNode root) {
        if(root == null) return;
        
        inorder(root.left);  
        res.add(root.val);  
        inorder(root.right); 
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root)); // Output: [1, 3, 2]
    }
}