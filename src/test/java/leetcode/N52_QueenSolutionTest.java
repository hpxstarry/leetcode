package leetcode;

import org.junit.Assert;

public class N52_QueenSolutionTest {
    N52_QueenSolution solution = new N52_QueenSolution();

    @org.junit.Test
    public void solveNQueens_n5() {
        System.out.println(solution.totalNQueens(5));
    }

    @org.junit.Test
    public void solveNQueens_n4() {
        Assert.assertEquals(2, solution.totalNQueens(4));
    }

    @org.junit.Test
    public void solveNQueens_n3() {
        Assert.assertEquals(0, solution.totalNQueens(3));
    }


    @org.junit.Test
    public void solveNQueens_n2() {
        Assert.assertEquals(0, solution.totalNQueens(2));
    }



    @org.junit.Test
    public void solveNQueens_n_invalid() {
        Assert.assertEquals(0, solution.totalNQueens(-1));
    }
}