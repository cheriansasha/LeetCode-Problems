class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> start = new HashSet<String>();

        //adds starting cities to a set
        for(List<String> path : paths) {
            start.add(path.get(0));
        }

        //looking for ending cities that is NOT a starting city to return
        for(List<String> path : paths) {
            if(!(start.contains(path.get(1)))) {
                return path.get(1);
            }
        }

        return null;
    }
}