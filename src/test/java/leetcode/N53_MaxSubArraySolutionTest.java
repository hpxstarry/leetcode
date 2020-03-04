package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class N53_MaxSubArraySolutionTest {
    N53_MaxSubArraySolution solution = new N53_MaxSubArraySolution();

    @Test
    public void maxSubArray() {
        Assert.assertEquals(6, solution.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }


    @Test
    public void maxSubArray_Size0() {
        Assert.assertEquals(0, solution.maxSubArray(new int[] {}));
    }

    @Test
    public void maxSubArray_Size1() {
        Assert.assertEquals(-2, solution.maxSubArray(new int[] {-2}));
    }
}