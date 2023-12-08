package org.dbonhard.sliding.window;

import java.util.PriorityQueue;

public class SlidingWindowMaxValues {

    public static int[] solution(int[] nums, int k) {
        int start = 0;
        PriorityQueue<Integer> currentMax = new PriorityQueue<>(k);
        int[] result = new int[nums.length - (2 * (k - 1))];
        for (int end = 0; end < nums.length; end++) {
            if (currentMax.size() < k) {
                currentMax.add(nums[end]);
            } else {
                Integer poll = currentMax.poll();
                result[start] = poll;
                start++;
                currentMax.add(nums[end]);
                currentMax.remove(nums[end]);
            }
        }
        return new int[]{};
    }
}
