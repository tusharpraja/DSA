import java.util.Arrays;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0){
            return null;
        }
        int root = preorder[0];
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root){
                index = i;
            }
        }

        TreeNode node = new TreeNode(root);
        node.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        node.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));

        return node;
    }
}
