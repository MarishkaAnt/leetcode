package leetcode;

/**
 * 238. Product of Array Except Self
 */
/*
Given an integer array nums, return an array answer such that answer[i]
is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] res = new int[length];
        int[] right = new int[length];
        res[0] = 1;
        right[length - 1] = 1;
        for (int i = 1, j = length - 2; j >= 0 & i < length; i++, j--) {

            res[i] = nums[i - 1] * res[i - 1];
            right[j] = nums[j + 1] * right[j + 1];

        }

        for (int i = 0; i < length; i++) {
            res[i] *= right[i];
        }

        return res;
    }
    /*
    более быстрое решение:
        int length = nums.length;
        int[] res = new int[length];
        res[0] = 1;
        for (int i = 1; i < length; i++) {

            res[i] = nums[i - 1] * res[i - 1];

        }
        int rightProd = 1;
        for (int j = length - 2; j >= 0; j--) {

            rightProd *= nums[j + 1];

            res[j] *= rightProd;
        }

        return res;

     */
}
