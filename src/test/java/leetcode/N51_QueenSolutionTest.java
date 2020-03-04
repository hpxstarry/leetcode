package leetcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N51_QueenSolutionTest {

    @org.junit.Test
    public void solveNQueens_n5() {
        N51_QueenSolution solution = new N51_QueenSolution();
        System.out.println(solution.solveNQueens(5));
    }

    @org.junit.Test
    public void solveNQueens_n4() {
        N51_QueenSolution solution = new N51_QueenSolution();
        List<List<String>> resultForN4 = new ArrayList<>();
        resultForN4.add(new ArrayList<>());
        resultForN4.add(new ArrayList<>());
        resultForN4.get(0).addAll(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
        resultForN4.get(1).addAll(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));

        Assert.assertEquals(resultForN4, solution.solveNQueens(4));
    }

    @org.junit.Test
    public void solveNQueens_n3() {
        N51_QueenSolution solution = new N51_QueenSolution();

        Assert.assertEquals(new ArrayList<>(), solution.solveNQueens(3));
    }


    @org.junit.Test
    public void solveNQueens_n2() {
        N51_QueenSolution solution = new N51_QueenSolution();

        Assert.assertEquals(new ArrayList<>(), solution.solveNQueens(2));
    }



    @org.junit.Test
    public void solveNQueens_n_invalid() {
        N51_QueenSolution solution = new N51_QueenSolution();

        Assert.assertEquals(new ArrayList<>(), solution.solveNQueens(-1));
    }
}