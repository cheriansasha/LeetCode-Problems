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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        createArray(root, list);
        
        
        return list.get(k-1);
    }

    public void createArray(TreeNode root, List<Integer> list){
        //base case
        if(root == null){
        return;
        }
        
        createArray(root.left, list);
        list.add(root.val);
        createArray(root.right, list);
    }
}