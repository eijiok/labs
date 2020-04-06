package leet.april_05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit1() {
        Assertions.assertEquals(7, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,1,5,3,6,4}));
    }
    @Test
    void maxProfit2() {
        Assertions.assertEquals(4, new BestTimeToBuyAndSellStock().maxProfit(new int[]{1,2,3,4,5}));
    }
    @Test
    void maxProfit3() {
        Assertions.assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,6,4,3,1}));
    }
}