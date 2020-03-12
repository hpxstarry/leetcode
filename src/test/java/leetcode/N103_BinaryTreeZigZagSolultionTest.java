package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class N103_BinaryTreeZigZagSolultionTest {
    N103_BinaryTreeZigZagSolultion solution = new N103_BinaryTreeZigZagSolultion();

    @Test
    public void zigzagLevelOrder() {
        N103_BinaryTreeZigZagSolultion.TreeNode root = new N103_BinaryTreeZigZagSolultion.TreeNode(3);
        N103_BinaryTreeZigZagSolultion.TreeNode l1_left = new N103_BinaryTreeZigZagSolultion.TreeNode(9);
        N103_BinaryTreeZigZagSolultion.TreeNode l1_right = new N103_BinaryTreeZigZagSolultion.TreeNode(20);
        root.left = l1_left;
        root.right = l1_right;
        N103_BinaryTreeZigZagSolultion.TreeNode l2_left = new N103_BinaryTreeZigZagSolultion.TreeNode(15);
        N103_BinaryTreeZigZagSolultion.TreeNode l2_right = new N103_BinaryTreeZigZagSolultion.TreeNode(7);
        l1_right.left = l2_left;
        l1_right.right = l2_right;

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.get(0).add(3);
        result.get(1).add(20);
        result.get(1).add(9);
        result.get(2).add(15);
        result.get(2).add(7);
        Assert.assertEquals(result, solution.zigzagLevelOrder(root));
    }

    @Test
    public void zigzagLevelOrder_null() {
        List<List<Integer>> result = new ArrayList<>();
        Assert.assertEquals(result, solution.zigzagLevelOrder(null));
    }

    @Test
    public void zigzagLevelOrder_1() {
        N103_BinaryTreeZigZagSolultion.TreeNode root = new N103_BinaryTreeZigZagSolultion.TreeNode(1);
        N103_BinaryTreeZigZagSolultion.TreeNode l1_left = new N103_BinaryTreeZigZagSolultion.TreeNode(2);
        N103_BinaryTreeZigZagSolultion.TreeNode l1_right = new N103_BinaryTreeZigZagSolultion.TreeNode(3);
        root.left = l1_left;
        root.right = l1_right;
        N103_BinaryTreeZigZagSolultion.TreeNode l2_left = new N103_BinaryTreeZigZagSolultion.TreeNode(4);
        N103_BinaryTreeZigZagSolultion.TreeNode l2_right = new N103_BinaryTreeZigZagSolultion.TreeNode(5);
        l1_left.left = l2_left;
        l1_right.right = l2_right;

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.get(0).add(1);
        result.get(1).add(3);
        result.get(1).add(2);
        result.get(2).add(4);
        result.get(2).add(5);
        Assert.assertEquals(result, solution.zigzagLevelOrder(root));
    }
}