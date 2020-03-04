package leetcode;

public class N63_UniquePathSolution {
    // DP pathArray[i][j] = pathArray[i+1][j] + pathArray[i][j+1] if no obstacle; otherwise is zero.
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }

        int rowNum = obstacleGrid.length;
        int colNum = obstacleGrid[0].length;

        int[][] pathArray = new int[rowNum + 1][colNum + 1]; // an additional row and column is added just to get rid of edge case at row end and col end.
        pathArray[rowNum][colNum-1] = 1;    // use to set pathArray[rowNum-1][colNum-1]

        for (int row = rowNum - 1; row >= 0; --row) {
            for (int col = colNum - 1; col >= 0; --col) {
                if (obstacleGrid[row][col] == 1) {
                    pathArray[row][col] = 0;
                } else {
                    pathArray[row][col] = pathArray[row + 1][col] + pathArray[row][col + 1];
                }
            }
        }

        return pathArray[0][0];
    }
}
