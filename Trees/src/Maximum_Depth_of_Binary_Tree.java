public class Maximum_Depth_of_Binary_Tree {
    public class TreeNode {
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

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        int Left = maxDepth(root.left);
        int Right = maxDepth(root.right);

        int depth = Math.max(Left,Right) + 1;

        return depth;
    }
}
