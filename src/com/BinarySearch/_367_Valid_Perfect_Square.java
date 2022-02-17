package com.BinarySearch;

/**
 * https://leetcode.com/problems/valid-perfect-square/
 */
public class _367_Valid_Perfect_Square {
    public static boolean isPerfectSquare(int num) {

        int left = 0, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid < num) {
                left = mid + 1;
            } else if ((long) mid * mid > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(0));

    }
}
