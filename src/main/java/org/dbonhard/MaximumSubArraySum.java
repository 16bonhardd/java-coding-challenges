package org.dbonhard;

public class MaximumSubArraySum {

    public static int maxProduct(int[] nums) {
        int max = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            int current = 1;

            current *= nums[end];
//1,2,3,4,5,-10,2,3,4,-5
//1,2,6,24,120,-1200,
//            if()

            max = Math.max(max, current);
        }

        return max;
    }
}
