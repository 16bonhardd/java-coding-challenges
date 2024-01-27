package org.dbonhard;

public class LengthOfLIS {
    private int[] memo;

    public int lengthOfLIS(int[] nums) {
        memo = new int[nums.length];
        int max = 0;

        for (int i = nums.length - 1; i > 0; i--) {
            memo[i - 1] = nums[i - 1] < nums[i] ? memo[i] + 1 : 1;
            max = Math.max(max, memo[i - 1]);
        }

        return max;
    }

    public int lengthOfLISSimple(int [] nums){
        int max = 0;
        for(int i = 0; i < nums.length; i++){
           int currentMax = 0;
           for(int j = i; j < nums.length; j++){
//                if (nums[i] < nums[j])
           }

        }
        return max;
    }

}
