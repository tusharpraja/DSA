public class Kth_Smallest_Element_in_a_BST {
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

    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root,k).val;
    }

    public TreeNode helper(TreeNode root, int k){
        if(root == null){
            return null;
        }

        TreeNode left = helper(root.left,k);
        if(left != null){
            return left;
        }
        count++;

        if(count == k){
            return root;
        }
        return helper(root.right, k);
    }
}

//Input: root = [3,1,4,null,2], k = 1
//Output: 1
//Input: root = [5,3,6,2,4,null,null,1], k = 3
//Output: 3
