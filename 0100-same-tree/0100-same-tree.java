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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //understand
        //time/space constraint?
        //need to know forumula for parent/child?

        //match- traverse through every node in both trees
        //need recursion

        //implement

        //base case 1: both p and q are null, thus true
        if(p == null && q == null) {
            return true;
        }

        //base case 2: p OR q is null or p not equal to q, thus false
        if(p == null || q == null || p.val != q.val) {
            return false;
        }

        //recursive case: first checks left of node, then if left of node is true
        //then if true, checks right of node
        else {
            boolean leftCheck = isSameTree(p.left, q.left);
            if(leftCheck) {
                return isSameTree(p.right, q.right);
            }
            else {
                return false;
            }
        }   
    }
}