package org.dbonhard;

import org.dbonhard.sliding.window.StockTrader;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockTraderTest {

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}),
                Arguments.of(new int[]{0, 1, 5, 3, 6, 4}),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    void test(int[] stocks) {
//        int[] stocks = {7, 1, 5, 3, 6, 4};
        int profit = StockTrader.maxProfit(stocks);
        assertEquals(5, profit);
    }

}