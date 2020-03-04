package leetcode;

import java.util.stream.IntStream;

public class N53_MaxSubArraySolution {

    public int maxSubArray(int[] nums) {
        return new GoodPerformanceSolution().maxSubArray(nums);
    }

    public class GoodStyleSolution {
        public int maxSubArray(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            int[] maxValueEndingWithIndex = new int[nums.length];
            maxValueEndingWithIndex[0] = nums[0];
            for (int i = 1;i < nums.length;++i) {
                maxValueEndingWithIndex[i] = nums[i];
                if (maxValueEndingWithIndex[i-1] > 0) {
                    maxValueEndingWithIndex[i] += maxValueEndingWithIndex[i-1];
                }
            }
            return IntStream.of(maxValueEndingWithIndex).max().orElse(0);
        }
    }


    public class GoodPerformanceSolution {
        public int maxSubArray(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            int maxValue = Integer.MIN_VALUE;

            int previousValueEndWithIndex = nums[0];
            maxValue = Math.max(previousValueEndWithIndex, maxValue);

            for (int i = 1;i < nums.length;++i) {
                if (previousValueEndWithIndex > 0) {
                    previousValueEndWithIndex += nums[i];
                } else {
                    previousValueEndWithIndex = nums[i];
                }

                maxValue = Math.max(previousValueEndWithIndex, maxValue);
            }

            return maxValue;
        }
    }
}
