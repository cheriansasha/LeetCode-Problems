class Solution {
    public int findCenter(int[][] edges) {
        //idea: check which node is connected to 2 different edges 

        int node1 = edges[0][0];
        int node2 = edges[0][1];
        int node3 = edges[1][0];
        int node4 = edges[1][1];

        if(node1 == node3 || node1 == node4) {
            return node1;
        }
        if(node2 == node3 || node2 == node4) {
            return node2;
        }
        
        return 0;
    }
}