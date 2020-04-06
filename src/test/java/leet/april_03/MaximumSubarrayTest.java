package leet.april_03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    @Test
    public void test(){
        Assertions.assertEquals(6, new MaximumSubarray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(1, new MaximumSubarray().maxSubArray(new int[]{1}));
    }
}