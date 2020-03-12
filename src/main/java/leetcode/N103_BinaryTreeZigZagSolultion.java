package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N103_BinaryTreeZigZagSolultion {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        recursiveTraversal(root, traversal, 0);
        return traversal;
    }

    private void recursiveTraversal(TreeNode node, List<List<Integer>> traversalResult, int level) {
        if (node == null) {
            return;
        }

        List<Integer> traversalForThisLevel = null;
        if (traversalResult.size() <= level) {
            for (int i = traversalResult.size(); i <= level; ++i) {
                if (i % 2 == 1) {
                    traversalResult.add(new LinkedList<>()); // optimize for insert at 0 operation
                } else {
                    traversalResult.add(new ArrayList<>());
                }
            }
        }
        traversalForThisLevel = traversalResult.get(level);
        if (level % 2 == 1) {
            // reverse order at this level
            // normal order at next level
            traversalForThisLevel.add(0, node.val);
        } else {
            traversalForThisLevel.add(node.val);
        }
        if (node.left != null) {
            recursiveTraversal(node.left, traversalResult, level + 1);
        }
        if (node.right != null) {
            recursiveTraversal(node.right, traversalResult, level + 1);
        }

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
