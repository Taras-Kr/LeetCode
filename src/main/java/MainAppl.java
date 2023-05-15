public class MainAppl {
    public static void main(String[] args) {
        Easy easy = new Easy();
        int[] nums = {3, 3};
        int target = 6;
        int[] res = easy.twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(i + "-" + res[i]);

        }
//        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
//        int[] nums2 = {1,2,2};
//        int m = 6;
//        int n = 3;
        //expected = [-1,0,0,1,2,2,3,3,3]
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int[] nums2 = {2, 5, 6};
//        int m = 3;
//        int n = 3;
//expected = [1,2,2,3,5,6]
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 3;
        int n = 3;
//expected = [1,2,2,3,5,6]
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println("");
        easy.merge(nums1, m, nums2, n);


        //----------------------------------------
        int[] array = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        //expected  = [0,1,4,0,3]
        easy.removeElement(array, val);
        //------------------------------------------

        //-----------------------------------------
        int[] remDuplicates = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //expected = [0,1,2,3,4,_,_,_,_,_]
        // k = 5
        System.out.println("Count: " + easy.removeDuplicates(remDuplicates));
        //--------------------------


    }


}
