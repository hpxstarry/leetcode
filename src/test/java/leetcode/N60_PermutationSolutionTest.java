package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class N60_PermutationSolutionTest {
    N60_PermutationSolution solution = new N60_PermutationSolution();

    @Test
    public void getPermutation() {
        Assert.assertEquals("213", solution.getPermutation(3, 3));
    }

    @Test
    public void getPermutation1() {
        Assert.assertEquals("1", solution.getPermutation(1, 1));
    }

    @Test
    public void getPermutation2() {
        Assert.assertEquals("12", solution.getPermutation(2, 1));
        Assert.assertEquals("21", solution.getPermutation(2, 2));
    }

    @Test
    public void getPermutation3() {
        Assert.assertEquals("123", solution.getPermutation(3, 1));
        Assert.assertEquals("132", solution.getPermutation(3, 2));
        Assert.assertEquals("213", solution.getPermutation(3, 3));
        Assert.assertEquals("231", solution.getPermutation(3, 4));
        Assert.assertEquals("312", solution.getPermutation(3, 5));
        Assert.assertEquals("321", solution.getPermutation(3, 6));
    }

    @Test
    public void getPermutation4() {
        Assert.assertEquals("1234", solution.getPermutation(4, 1));
        Assert.assertEquals("1243", solution.getPermutation(4, 2));
        Assert.assertEquals("1324", solution.getPermutation(4, 3));
        Assert.assertEquals("1342", solution.getPermutation(4, 4));
        Assert.assertEquals("1423", solution.getPermutation(4, 5));
        Assert.assertEquals("2314", solution.getPermutation(4, 9));
    }

}