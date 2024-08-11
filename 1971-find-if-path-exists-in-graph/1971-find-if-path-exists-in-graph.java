class Solution {
    boolean found;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //understand: ret ture if path from src to dest exists, false otherwise

        //match/plan: hash map to identify all nodes directly connected to source
        //visted array to keep track of visted nodes
        //dfs helper method to recursively call search on every connected node

        //base case: if src == dest
        if(source == destination) {
            return true;
        }

        //implement
        boolean visited[] = new boolean[n];

        //creating connectNodes hashmap
        Map<Integer,List<Integer>> connectNodes = new HashMap();
        //adding all of the keys to the hashmap
        for(int i = 0; i < n; i++) {
            connectNodes.put(i, new ArrayList());
        }

        //add every key in edges to every list values
        for(int[] edge : edges) {
            connectNodes.get(edge[0]).add(edge[1]);
            connectNodes.get(edge[1]).add(edge[0]);
        }
        
        dfs(connectNodes, source, destination, visited);

        return found;
    }

    public void dfs(Map<Integer, List<Integer>> connectNodes, int src, int dest, boolean[] visited) {
        //return if src alr visited
        if(visited[src]) {
            return;
        }

        //check src at visited
        visited[src] = true;

        for(int i = 0; i < connectNodes.get(src).size(); i++) {
            if(connectNodes.get(src).get(i) == dest) {
                found = true;
            }
            dfs(connectNodes, connectNodes.get(src).get(i), dest, visited);
        }        
    }
}