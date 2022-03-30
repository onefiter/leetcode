package com.coderdw;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(fib(30));
        long endTime = System.currentTimeMillis();
        System.out.println("执行的时间：" + (endTime - startTime) + "ms");

        long startTime1 = System.currentTimeMillis();
        System.out.println(fib1(30));
        long endTime1 = System.currentTimeMillis();
        System.out.println("优化前执行的时间：" + (endTime1 - startTime1) + "ms");
    }

    /**
     * 斐波那切数列
     *
     * @param n
     * @return
     */
    public static long fib(long n) {
        if (n <= 1) {
            return n;
        }
        long f1 = 0, f2 = 1;
        for (int i = 1; i < n; i++) {
            f2 = f1 + f2;
            f1 = f2 - f1;
        }
        return f2;
    }

    /**
     * 递归斐波那契数列
     *
     * @param n
     * @return
     */
    public static long fib1(long n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }
}
