package leet.april_04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void moveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        printArray(nums);
        Assertions.assertArrayEquals(new int[] {1,3,12,0,0}, nums);
    }

    private void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}