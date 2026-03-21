//#98 - Validate Binary Search Tree
public class P3ValidBST {

    public boolean isValidBST(TreeNode root) {
        return isValidate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidate(TreeNode node, long min, long max){
        if(node == null) return true;
        if(node.val <= min || node.val >= max) return false;

        return isValidate(node.left, min, node.val) && isValidate(node.right, node.val, max);
    }

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
        P3ValidBST solution = new P3ValidBST();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean isValid = solution.isValidBST(root);
        System.out.println("Is Valid BST? " + isValid); // Output: true
        
        // Let's test an invalid case too
        TreeNode invalidRoot = new TreeNode(5);
        invalidRoot.left = new TreeNode(1);
        invalidRoot.right = new TreeNode(4); // Invalid: 4 is less than 5 but on the right
        invalidRoot.right.left = new TreeNode(3);
        invalidRoot.right.right = new TreeNode(6);
        
        System.out.println("Is Invalid Tree a BST? " + solution.isValidBST(invalidRoot)); // Output: false
    }
}