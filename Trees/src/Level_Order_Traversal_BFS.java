import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Level_Order_Traversal_BFS {

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


  public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();

      if (root == null){
          return result;
      }

      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);

      while (!queue.isEmpty()){
          int levelSize = queue.size();   // only jo node add hoga uske size tak
          List<Integer> currentLevel = new ArrayList<>(levelSize);
          for (int i = 0; i < levelSize; i++) {
              TreeNode currentNode = queue.poll();       // removes the element at the front
              currentLevel.add(currentNode.val);        // add in internal level

              if (currentNode.left != null){
                  queue.offer(currentNode.left);          // queue.offer:- inserts the specified element into this queue
              }

              if (currentNode.right != null){
                  queue.offer(currentNode.right);
              }
          }
          result.add(currentLevel);           //full level
      }
      return result;
  }
}
