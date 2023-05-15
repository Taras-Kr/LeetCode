import java.lang.reflect.Array;
import java.util.Arrays;

public class Easy {
    public int[] twoSum(int[] nums, int target) {
        int secondInt = 0;
        int[] result = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            secondInt = target - nums[i];
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

    public int removeElement(int[] nums, int val) {
        System.out.print("Input: ");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");

        }
        System.out.println();
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
        System.out.print("Output: ");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");

        }
        System.out.println();
        return nums.length - count;
    }

    public int removeDuplicates(int[] nums) {

        System.out.print("//-----removeDuplicates-----" + "\n" + "Input: ");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();


        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }

        }
        System.out.print("Output: ");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();
        return i +1;
    }

}
