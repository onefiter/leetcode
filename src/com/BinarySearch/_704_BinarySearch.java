package com.BinarySearch;

/**
 *
 */
public class _704_BinarySearch {

    /**
     * 二分查找
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {

        int left = 0, right = nums.length, rs = -1;
        if (right == 0) return rs;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }

        }
        return rs;
    }

    /**
     * 暴力解法
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int searchV1(int[] nums, int target) {
        int rs = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

        }
        return  rs;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int ret = searchV1(nums, 12);
        System.out.println(ret);
    }

}
