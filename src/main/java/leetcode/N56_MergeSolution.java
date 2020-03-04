package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class N56_MergeSolution {

    public int[][] merge(int[][] intervals) {
        List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals));
        Collections.sort(intervalList, Comparator.comparingInt(o -> o[0]));

        Stack<int[]> mergedIntervalStack = new Stack<>();
        for (int[] curInterval : intervalList) {
            int[] preInterval = mergedIntervalStack.empty() ? null : mergedIntervalStack.peek();
            if (canMerge(preInterval, curInterval)) {
                int[] mergedInterval = merge(preInterval, curInterval);
                mergedIntervalStack.pop();
                mergedIntervalStack.push(mergedInterval);
            } else {
                mergedIntervalStack.push(curInterval);
            }
        }

        return mergedIntervalStack.toArray(new int[][]{});
    }


    private boolean canMerge(int[] pre, int[] cur) {
        if (pre == null) {
            return false;
        }
        return pre[1] >= cur[0];
    }

    private int[] merge(int[] pre, int[] cur) {
        return new int[] {pre[0], Math.max(pre[1], cur[1])};
    }
}
