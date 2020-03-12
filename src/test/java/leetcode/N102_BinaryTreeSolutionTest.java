package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class N102_BinaryTreeSolutionTest {
    N102_BinaryTreeSolution solution = new N102_BinaryTreeSolution();

    @Test
    public void levelOrder() {
        N102_BinaryTreeSolution.TreeNode root = new N102_BinaryTreeSolution.TreeNode(3);
        N102_BinaryTreeSolution.TreeNode l1_left = new N102_BinaryTreeSolution.TreeNode(9);
        N102_BinaryTreeSolution.TreeNode l1_right = new N102_BinaryTreeSolution.TreeNode(20);
        root.left = l1_left;
        root.right = l1_right;
        N102_BinaryTreeSolution.TreeNode l2_left = new N102_BinaryTreeSolution.TreeNode(15);
        N102_BinaryTreeSolution.TreeNode l2_right = new N102_BinaryTreeSolution.TreeNode(7);
        l1_right.left = l2_left;
        l1_right.right = l2_right;

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.get(0).add(3);
        result.get(1).add(9);
        result.get(1).add(20);
        result.get(2).add(15);
        result.get(2).add(7);
        Assert.assertEquals(result, solution.levelOrder(root));
    }

    @Test
    public void levelOrder_null() {
        List<List<Integer>> result = new ArrayList<>();
        Assert.assertEquals(result, solution.levelOrder(null));
    }
}