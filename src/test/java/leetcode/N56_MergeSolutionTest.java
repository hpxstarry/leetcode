package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class N56_MergeSolutionTest {
    N56_MergeSolution solution = new N56_MergeSolution();

    @Test
    public void merge() {
        int[][] matrix = new int[4][2];
        matrix[0] = new int[] {1, 3};
        matrix[1] = new int[] {2, 6};
        matrix[2] = new int[] {8, 10};
        matrix[3] = new int[] {15, 18};
        Assert.assertArrayEquals(new int[][] {new int[]{1, 6}, new int[]{8, 10}, new int[] {15, 18}},  solution.merge(matrix));
    }



    @Test
    public void merge1() {
        int[][] matrix = new int[0][0];
        Assert.assertArrayEquals(new int[0][0],  solution.merge(matrix));
    }


    @Test
    public void merge2() {
        int[][] matrix = new int[5][2];
        matrix[0] = new int[] {1, 3};
        matrix[1] = new int[] {2, 6};
        matrix[2] = new int[] {4, 8};
        matrix[3] = new int[] {15, 18};
        matrix[4] = new int[] {0, 2};
        Assert.assertArrayEquals(new int[][] {new int[]{0, 8}, new int[] {15, 18}},  solution.merge(matrix));
    }

    @Test
    public void merge3() {
        int[][] matrix = new int[2][2];
        matrix[0] = new int[] {1, 4};
        matrix[1] = new int[] {4, 5};
        Assert.assertArrayEquals(new int[][] {new int[]{1, 5}},  solution.merge(matrix));
    }


    @Test
    public void merge4() {
        int[][] matrix = new int[][]{
                new int[] {2, 3},
                new int[] {2, 2},
                new int[] {3, 3},
                new int[] {1, 3},
                new int[] {5, 7},
                new int[] {2, 2},
                new int[] {4, 6}
        };
        Assert.assertArrayEquals(new int[][] {new int[]{1, 3}, new int[]{4, 7}},  solution.merge(matrix));
    }
}
