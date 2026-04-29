//#653 - Two Sum IV - Input is a BST
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class P1TwoSumBST {

    static HashSet<Integer> s = new HashSet<>();
    public static boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        if(s.contains(k - root.val)) {
            return true;
        }
        s.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
   
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        
        int k = 9;
        boolean result = findTarget(root, k);
        System.out.println(result); 
    }
}
