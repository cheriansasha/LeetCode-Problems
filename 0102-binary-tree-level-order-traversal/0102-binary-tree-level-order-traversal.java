/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
    if(root == null){
      return result;
    }
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    while(!q.isEmpty()){
      int levelNum = q.size();
      List<Integer> level = new ArrayList<Integer>();
      for(int i = 0 ; i < levelNum; i++) {

        //adding children into queue
        if(q.peek().left != null) {
          q.add(q.peek().left);
        }
        if(q.peek().right!= null) {
          q.add(q.peek().right);
        }

        level.add(q.poll().val);
        
      }
      result.add(level);
    } 
    return result;
  }
}