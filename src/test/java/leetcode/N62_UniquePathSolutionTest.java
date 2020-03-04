package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class N62_UniquePathSolutionTest {
    N62_UniquePathSolution solution = new N62_UniquePathSolution();

    @Test
    public void uniquePaths() {
        Assert.assertEquals(3, solution.uniquePaths(3, 2));
        Assert.assertEquals(2, solution.uniquePaths(2, 2));
        Assert.assertEquals(28, solution.uniquePaths(7, 3));
        Assert.assertEquals(28, solution.uniquePaths(3, 7));
        Assert.assertEquals(0, solution.uniquePaths(0, 7));
        Assert.assertEquals(48620, solution.uniquePaths(10, 10));
    }
}