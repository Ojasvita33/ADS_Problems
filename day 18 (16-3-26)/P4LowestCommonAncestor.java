//#235 - Lowest Common Ancestor of a Binary Search Tree
public class P4LowestCommonAncestor {
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root; 
        }
    }

    public static void main(String[] args) {
        P4LowestCommonAncestor solution = new P4LowestCommonAncestor();
        
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        
        TreeNode lca1 = solution.lowestCommonAncestor(root, p, q);
        System.out.println("LCA of " + p.val + " and " + q.val + " is: " + lca1.val); // Output: 6
        
        TreeNode p2 = new TreeNode(2);
        TreeNode q2 = new TreeNode(4);
        TreeNode lca2 = solution.lowestCommonAncestor(root, p2, q2);
        System.out.println("LCA of " + p2.val + " and " + q2.val + " is: " + lca2.val); // Output: 2
    }
}