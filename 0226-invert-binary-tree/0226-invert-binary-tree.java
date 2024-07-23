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
    public TreeNode invertTree(TreeNode root) {

        //match
        //need to swap nodes all throughout the tree: thus preorder traversal
        //or apply level order traversal with queue

        //plan
        //recursion where every node's left and right child are swapped
        //base case: null node
        //swap left and right nodes
        //return the node with the swapped children

        //implement

        //base case
        if(root == null) {
            return root;
        }

        //traverses through entire tree
        invertTree(root.left);
        invertTree(root.right);

        //swap left and right nodes
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        //return root
        return root;
    }
}