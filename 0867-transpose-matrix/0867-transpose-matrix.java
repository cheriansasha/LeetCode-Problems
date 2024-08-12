class Solution {
    public int[][] transpose(int[][] matrix) {
        //understand: switching row and col indices
        //might not be same dimensions, thus need to breate new result matrix

        //match: two for loops to manipulate matrix

        //plan: initalize result matrix
        //use temp variable to switch variables
        //test if it works without dividing length of for loop in half

        //implement:
        int result[][] = new int[matrix[0].length][matrix.length];

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }
}