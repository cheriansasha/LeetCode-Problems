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
    //method that main calls
    public boolean isBalanced(TreeNode root) {
        //calls helper method
        if(countHeight(root) == -1) {
            return false;
        }
        return true;
    }

    //helper method
    public int countHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
    
        int lHeight = countHeight(root.left);
        int rHeight = countHeight(root.right);

        if(lHeight - rHeight > 1 || lHeight == -1 || rHeight == -1) {
            return -1;
        }

        //return the height of this subtree as max(leftHeight, rightHight) + 1...
        return Math.max(lHeight,rHeight) + 1;    
    }
}