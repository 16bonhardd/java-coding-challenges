package org.dbonhard.sliding.window;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MaxSubArrayBySum {

    public static int[] maxSubArrayBySum(int[] nums) {
        int start = 0;
        int end = 0;
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                end = i;
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                start = i + 1;
                currentSum = 0;
            }
        }
        if (start > end) {
            return new int[]{};
        }
        return Arrays.copyOfRange(nums, start, end + 1);
    }
}
