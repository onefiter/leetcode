package com.Array;

/**
 * https://leetcode.com/problems/climbing-stairs/
 */
public class _70_Climbing_Stairs {
    public static int climbStairs(int n) {
        if ( n <= 2) {
            return n;
        }
        int f1 = 1, f2 = 2;
        for (int i = 1; i < n - 1; i++) {
            f2 = f1 + f2;
            f1 = f2 - f1;
        }
        return  f2;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
    }
}
