public class P1DFS {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { 
            this.val = val; 
            left=right=null;
        }
    }

    public static boolean dfs(TreeNode root, int target) {
        if (root == null) return false;
        if (root.val == target) return true;
        return dfs(root.left, target) || dfs(root.right, target);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        System.out.println(dfs(root, 15));
        System.out.println(dfs(root, 7));
    }
}
