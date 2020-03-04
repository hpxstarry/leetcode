package leetcode;

public class N64_MinPathSumSolution {
    // 2D DP. minPathSum[i][j] = grid[i][j] + min(minPathSum[i+1][j], minPathSum[i][j+1])
    public int minPathSum(int[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rowNum = grid.length;
        int colNum = grid[0].length;

        int[][] minPathSum = new int[rowNum][colNum]; // an additional row and column is added just to get rid of edge case at row end and col end.

        minPathSum[rowNum - 1][colNum - 1] = grid[rowNum - 1][colNum - 1];

        // last row
        for (int col = colNum - 2; col >= 0; --col) {
            minPathSum[rowNum - 1][col] = minPathSum[rowNum - 1][col + 1] + grid[rowNum - 1][col];
        }

        // last col
        for (int row = rowNum - 2; row >= 0; --row) {
            minPathSum[row][colNum - 1] = minPathSum[row + 1][colNum - 1] + grid[row][colNum - 1];
        }


        for (int row = rowNum - 2; row >= 0; --row) {
            for (int col = colNum - 2; col >= 0; --col) {
                minPathSum[row][col] = Math.min(minPathSum[row + 1][col], minPathSum[row][col + 1]) + grid[row][col];
            }
        }

        return minPathSum[0][0];
    }
}
