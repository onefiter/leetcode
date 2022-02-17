package com.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }
}
