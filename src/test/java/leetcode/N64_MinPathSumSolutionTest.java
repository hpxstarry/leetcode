package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class N64_MinPathSumSolutionTest {
    N64_MinPathSumSolution solution = new  N64_MinPathSumSolution();

    @Test
    public void uniquePathsWithObstacles() {
        Assert.assertEquals(7, solution.minPathSum(
                new int[][] {new int[]{1, 3, 1}, new int[]{1, 5, 1}, new int[]{4, 2, 1}}
        ));
    }
}