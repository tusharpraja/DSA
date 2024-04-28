import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_Levels_in_Binary_Tree_BFS {
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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            double averageLevel = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                averageLevel += currentNode.val;    // add kar liye level wise
                if (currentNode.left != null){
                    queue.offer(currentNode.left);        // queue.offer:- inserts the specified element into this queue
                }
                if (currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            averageLevel = averageLevel / levelSize;  // average kar diya level wise
            result.add(averageLevel);                   // result me add kar diya
        }
        return result;
    }
}
