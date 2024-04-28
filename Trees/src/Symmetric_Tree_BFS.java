import java.util.LinkedList;
import java.util.Queue;

public class Symmetric_Tree_BFS {
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

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()){
            TreeNode left = queue.poll();         //delete and store
            TreeNode right = queue.poll();

            if (left == null && right == null){       //both are null then
                continue;
            }

            if (left == null || right == null){   //if anyone null
                return false;
            }

            if (left.val != right.val){        //value was not match
                return false;
            }

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }

        return true;
    }

}
