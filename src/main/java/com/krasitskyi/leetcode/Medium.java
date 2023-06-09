package com.krasitskyi.leetcode;

public class Medium {
    /*
    Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each
    unique element appears at most twice. The relative order of the elements should be kept the same.

    Since it is impossible to change the length of the array in some languages, you must instead have the result
    be placed in the first part of the array nums. More formally, if there are k elements after removing the
    duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave
    beyond the first k elements.

    Return k after placing the final result in the first k slots of nums.

    Do not allocate extra space for another array. You must do this by modifying the input array
    in-place with O(1) extra memory.

    Input example array = {0,0,1,1,1,1,3,3,3,3,3}
    */
    public int removeDuplicates(int[] nums) {
        int arraySize = nums.length;
        if (arraySize == 1) {
            return 1;
        }
        int lastUnique = 0;
        for (int current = 1; current < nums.length; current++) {
            if (nums[lastUnique] == nums[current]) {
                if (lastUnique - 1 < 0 || nums[lastUnique - 1] != nums[current]) {
                    lastUnique++;
                    nums[lastUnique] = nums[current];
                }
            } else {
                lastUnique++;
                nums[lastUnique] = nums[current];
            }
        }
        return lastUnique + 1;
    }
}
