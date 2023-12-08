package org.dbonhard.sliding.window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxSlidingWindowTest {

    @Test
    void test() {
        int[] ints = MaxSubArrayBySum.maxSubArrayBySum(new int[]{1, -2, 1, 2, 3, -5});
        assertThat(ints).containsSequence(1, 2, 3);
    }

}