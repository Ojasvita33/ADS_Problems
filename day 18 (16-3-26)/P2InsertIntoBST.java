//#701 - Insert into a Binary Search Tree
public class P2InsertIntoBST {
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

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        P2InsertIntoBST solution = new P2InsertIntoBST();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int valToInsert = 5;
        TreeNode updatedRoot = solution.insertIntoBST(root, valToInsert);
        
        System.out.println("Root value: " + updatedRoot.val); // Output: 4
        System.out.println("Root -> Right value: " + updatedRoot.right.val); // Output: 7
        System.out.println("Root -> Right -> Left value: " + updatedRoot.right.left.val); // Output: 5
    }
}