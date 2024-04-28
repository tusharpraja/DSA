public class Lowest_Common_Ancestor_of_a_Binary_Tree {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if(root == null){
             return null;
         }

         if (root == p || root == q){   //bcz root is always ancestor
             return root;
         }

         TreeNode left = lowestCommonAncestor(root.left,p,q);   //check it left
         TreeNode right = lowestCommonAncestor(root.right,p,q);  //check it right

         if (left != null  && right != null){     //if both are null than return root
             return root;
         }
         // left is null return right and right is null return left
         return left == null ? right:left;
    }
}
