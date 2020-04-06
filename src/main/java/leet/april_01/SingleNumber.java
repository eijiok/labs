package leet.april_01;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int total  = 0;
        for (int num : nums) {
            total += num;
        }

        // 1 1 2
        return total ;
    }
}
