package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class N63_UniquePathSolutionTest {
    N63_UniquePathSolution solution = new N63_UniquePathSolution();

    @Test
    public void uniquePathsWithObstacles() {
        Assert.assertEquals(2, solution.uniquePathsWithObstacles(
                new int[][] {new int[]{0, 0, 0}, new int[]{0, 1, 0}, new int[]{0, 0, 0}}
        ));
    }

    @Test
    public void uniquePathsWithObstacles1() {
        Assert.assertEquals(0, solution.uniquePathsWithObstacles(
                new int[][] {new int[]{0, 0, 0}, new int[]{1, 1, 1}, new int[]{0, 0, 0}}
        ));
    }


    @Test
    public void uniquePathsWithObstacles2() {
        Assert.assertEquals(3, solution.uniquePathsWithObstacles(
                new int[][] {new int[]{0, 0, 0}, new int[]{0, 0, 1}, new int[]{0, 0, 0}}
        ));
    }

    @Test
    public void uniquePathsWithObstacles3() {
        Assert.assertEquals(0, solution.uniquePathsWithObstacles(
                new int[][] {new int[]{1}}));
    }
}