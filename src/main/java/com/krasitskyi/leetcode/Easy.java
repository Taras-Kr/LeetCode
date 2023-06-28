package com.krasitskyi.leetcode;

public class Easy {
    /*
     * Given an array of integers nums and an integer target,
     * return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */
    public int[] twoSum(int[] nums, int target) {

        int[] result = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            int secondInt = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == secondInt) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    /*
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
    representing the number of elements in nums1 and nums2 respectively.

    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
    and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

    /*
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the
    following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
    The remaining elements of nums are not important as well as the size of nums.
    Return k.
    */
    public int removeElement(int[] nums, int val) {

        int k = nums.length - 1;
        int i = nums.length - 1;
        int count = 0;
        while (i >= 0) {
            if (nums[i] == val) {
                nums[i] = nums[k];
                nums[k] = val;
                count++;
                k--;
            }
            i--;
        }
        return nums.length - count;
    }

    /*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
    element appears only once. The relative order of the elements should be kept the same. Then return the number of unique
    elements in nums.

    Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the unique elements in the order they
    were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    Return k.
     */
    public int removeDuplicates(int[] nums) {

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /*
    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than ⌊n / 2⌋ times.
    You may assume that the majority element always exists in the array.

    Constraints:
    n == nums.length
    1 <= n <= 5 * 10^4
    -10^9 <= nums[i] <= 10^9


    Follow-up: Could you solve the problem in linear time and in O(1) space?
    Example 2:

    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
     */


    public int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
            }
            if (majorityElement != nums[i]) {
                count--;
            } else {
                count++;
            }
        }
        return majorityElement;
    }

    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day
    in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    Example 1:
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

    Example 2:
    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: In this case, no transactions are done and the max profit = 0.

    Constraints:

    1 <= prices.length <= 105
    0 <= prices[i] <= 104
     */

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

}
