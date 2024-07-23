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
        //understand
        //if 9 had children, would the children be in same array as 20's children
        //can use BFS or DFS

        //match
        //recursion?? or maybe stack/queue??
        //not binary search tree
        //use level order traversal with queue

        //plan
        //first set root as list of its own
        //then set root.left and root.right
        //then set root.left's children and root.right's children to list
        //find a way to differentiate btn levels and print the correct children

        //maybe split into subtrees

        //implement

        // Create a results array to store each level.
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        //base case
        if(root == null) {
            return result;
        }

        // Create a queue with root node and process until no more nodes in queue
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {

            //keep track of current number of nodes in level currently
            //to avoid processesing new nodes
            int levelNum = queue.size();
            System.out.println("levelNum: " + levelNum);
            List<Integer> tempList = new LinkedList<Integer>();

            //process all nodes in current level
            for(int i = 0; i < levelNum; i++) {

                //add left child to queue
                if(queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }

                //add right child to queue
                if(queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }

                //adding current level nodes to list and deleting from head of queue
                tempList.add(queue.poll().val);
            }

            // Store level into results
            result.add(tempList);
        }

        return result;  
    }
}