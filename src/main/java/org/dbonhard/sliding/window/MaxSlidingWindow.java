package org.dbonhard.sliding.window;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaxSlidingWindow {

    public static int[] solution(int[] nums, int k) {
        Queue<Integer> set = new ArrayDeque<>(k);
        int maxSoFar = 0;
        int currentSum = 0;
        for (int num : nums) {
            if (set.size() < k) {
                set.add(num);
                currentSum += num;
            } else {
                Integer poll = set.poll();
                set.add(num);
                currentSum = currentSum + num - poll;
                maxSoFar = Math.max(currentSum, maxSoFar);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }


}
