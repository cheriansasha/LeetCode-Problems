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
    public List<Integer> inorderTraversal(TreeNode root) {

        //match: We should think about the order, and the order given is In-Order.

        //plan: DFS => use helper function
        //in helper method:
            //recurse through root.left
            //store in results array
            //recurse through root.right

        //in relavent method
            //create results array
            //call helper function on root
            //return results array


        //implement
        List<Integer> result = new ArrayList<Integer>();

        helper(root, result);
        return result;
    }

    public void helper(TreeNode root, List<Integer> result) {
        //base case
        if(root == null) {
            return;
        }

        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);
    }
}