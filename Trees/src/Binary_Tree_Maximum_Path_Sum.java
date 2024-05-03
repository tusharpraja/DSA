public class Binary_Tree_Maximum_Path_Sum {
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

   int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    public int helper(TreeNode node){
        if (node == null){
            return 0;
        }

        //Check the left and right side
        int left = helper(node.left);
        int right = helper(node.right);

        //solving negative of the roots
        left = Math.max(0,left);
        right = Math.max(0,right);

        int PathSum = left + right + node.val;

        ans = Math.max(ans,PathSum);

        return Math.max(left,right) + node.val;
    }
}
