package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N102_BinaryTreeSolution {

    public List<List<Integer>> levelOrder(TreeNode root) {
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
            for (int i = 0;i <= level - traversalResult.size();++i) {
                traversalResult.add(new ArrayList<>());
            }
        }
        traversalForThisLevel = traversalResult.get(level);
        traversalForThisLevel.add(node.val);
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
