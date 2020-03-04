package leetcode;

public class N55_CanJumpSolution {
    public boolean canJump(int[] nums) {
        return new GoodPerformanceSolution().canJump(nums);
    }

    public class GoodPerformanceSolution {
        /** for nums[i] == 0 cases, check all preceding element j before i to see whether nums[j] > i - j.  */
        public boolean canJump(int[] nums) {
            int indexOfLargestStopElementNotByPassed = -1;
            for (int i = nums.length - 2;i >= 0;i--) {
                int range = nums[i];
                if (range == 0 && indexOfLargestStopElementNotByPassed < 0) {
                    indexOfLargestStopElementNotByPassed = i;
                } else {
                    // see whether current range can bypass this element
                    if (indexOfLargestStopElementNotByPassed >= 0) {
                        if (range > indexOfLargestStopElementNotByPassed - i) {
                            indexOfLargestStopElementNotByPassed = -1;
                        }
                    }
                }
            }
            return indexOfLargestStopElementNotByPassed < 0;
        }
    }

    public class BackwardSolution {
        /** canJump[i] = or(canJump[i+1], ... canJump[i+ nums[i]] */
        public boolean canJump(int[] nums) {
            boolean[] canJump = new boolean[nums.length];
            canJump[canJump.length-1] = true;

            for (int i = nums.length - 2;i >= 0;i--) {
                int range = nums[i];
                range = Math.min(range, nums.length - 1 - i);
                if (range > 0) {
                    for (int r = 1;r <= range;++r) {
                        if (canJump[i + r]) {
                            canJump[i] = true;
                            break;
                        }
                    }
                }
            }
            return canJump[0];
        }

    }
}
