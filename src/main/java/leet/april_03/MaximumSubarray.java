package leet.april_03;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int firstPostiveIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                firstPostiveIndex = i;
                break;
            }
        }
        if (firstPostiveIndex < 0) {
            int maxNegative = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > maxNegative) {
                    maxNegative = nums[i];
                }
            }
            return maxNegative;
        }

        int acumulado = nums[firstPostiveIndex];
        int maxSoma = nums[firstPostiveIndex];
        for (int i = firstPostiveIndex + 1; i < nums.length; i++) {
            int n = nums[i];
            int novoAcumulado = acumulado + n;
            if (novoAcumulado > 0) {
                acumulado = novoAcumulado;
                if (acumulado > maxSoma){
                    maxSoma = acumulado;
                }
            } else {
                acumulado = 0;
            }
        }

        return maxSoma;
    }
}
