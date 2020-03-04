package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class N55_CanJumpSolutionTest {
    N55_CanJumpSolution solution = new N55_CanJumpSolution();

    @Test
    public void canJump() {
        Assert.assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void canJump2() {
        Assert.assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    public void canJump3() {
        Assert.assertFalse(solution.canJump(new int[]{2,0,1,0,1}));
    }
}