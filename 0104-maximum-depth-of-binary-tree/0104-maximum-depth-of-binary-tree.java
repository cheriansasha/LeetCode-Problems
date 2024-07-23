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
    public int maxDepth(TreeNode root) {
        //match: Applying a level-order traversal with a queue

        //plan
        //base case: root is null, return 0
        //traverse through entire tree, asking for the current height along the way
        //return the max height between root.left and root.right

        //implement
        int currHeight = 0;

        //base case
        if(root == null) {
            return 0;
        }

        currHeight++;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}