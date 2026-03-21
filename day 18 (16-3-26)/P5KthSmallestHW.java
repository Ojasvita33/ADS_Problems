import java.util.ArrayList;
import java.util.List;

// Required for local testing
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class P5KthSmallestHW {
    List<Integer> res = new ArrayList<>();
    
    // Removed 'static'
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return res.get(k - 1);
    }
    
    // Removed 'static'
    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        P5KthSmallestHW solution = new P5KthSmallestHW();
        int k = 1;
        System.out.println(solution.kthSmallest(root, k)); // Output: 1
    }
}