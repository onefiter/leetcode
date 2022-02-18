package com.BinarySearch;

/**
 * https://leetcode.com/problems/sqrtx/
 */
public class _69_Sqrt_x {
    public static int mySqrt(int x) {
        if (x == 0) return x;

        if (x > Integer.MAX_VALUE) {
            return -1;
        }
        int left = 0, right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long)mid * mid > x) {
                right = mid - 1;
            } else if ((long)mid * mid < x) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;

    }

    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }
}
