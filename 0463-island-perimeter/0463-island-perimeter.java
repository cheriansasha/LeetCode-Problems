class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                //explore current land
                if(grid[i][j] == 1) {
                    perimeter += dfs(grid, i, j);
                }
            }
        }
        System.out.println("perimeter: " + perimeter);
        return perimeter;
    }

    public int dfs(int[][] grid, int i, int j) {
        //if out of bounds, then perimeter found
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length) {
            return 1;
        }
        //if currently water, then perimeter found
        if(grid[i][j] == 0) {
            return 1;
        }
        //if already visited, add nothing
        if(grid[i][j] == -1) {
            return 0;
        }

        grid[i][j] = -1;

        //WANT TO ADD ALL POSSIBLE PERIMETERS AROUND CURRENT LAND TOGETHER
        //left
        return dfs(grid, i - 1, j) +
        //right
        dfs(grid, i + 1, j) +
        //up
        dfs(grid, i, j - 1) +
        //down
        dfs(grid, i, j + 1);
    }
}