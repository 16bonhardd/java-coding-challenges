package org.dbonhard.sliding.window;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockTrader {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int start = 0;

        for (int end = 0; end < prices.length; end++) {
            if (prices[end] > prices[start]) {
                maxProfit = Math.max(maxProfit, prices[end] - prices[start]);
            } else {
                start = end;
            }
        }

        return maxProfit;
    }
}
