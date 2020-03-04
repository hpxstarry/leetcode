package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class N54_SpiralMatrixSolutionTest {
    N54_SpiralMatrixSolution solution = new N54_SpiralMatrixSolution();

    @Test
    public void spiralOrder() {
        int[][] matrix = new int[3][3];
        matrix[0] = new int[] {1, 2, 3};
        matrix[1] = new int[] {4, 5, 6};
        matrix[2] = new int[] {7, 8, 9};
        Assert.assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5),  solution.spiralOrder(matrix));
    }

    @Test
    public void spiralOrder2() {
        int[][] matrix = new int[2][3];
        matrix[0] = new int[] {1, 2, 3};
        matrix[1] = new int[] {4, 5, 6};
        Assert.assertEquals(Arrays.asList(1, 2, 3, 6, 5, 4),  solution.spiralOrder(matrix));
    }

    @Test
    public void spiralOrder3() {
        int[][] matrix = new int[4][3];
        matrix[0] = new int[] {1, 2, 3};
        matrix[1] = new int[] {4, 5, 6};
        matrix[2] = new int[] {7, 8, 9};
        matrix[3] = new int[] {10, 11, 12};
        Assert.assertEquals(Arrays.asList(1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8),  solution.spiralOrder(matrix));
    }
}