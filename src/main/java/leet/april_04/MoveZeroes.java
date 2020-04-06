package leet.april_04;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (i < nums.length) {
            while (j < nums.length && nums[j] == 0) {
                j++;
            }
            if (j == nums.length) {
                while (i < nums.length) {
                    nums[i] = 0;
                    i++;
                }
                return;
            }
            nums[i] = nums[j];
            i++;
            j++;
        }
    }
}
