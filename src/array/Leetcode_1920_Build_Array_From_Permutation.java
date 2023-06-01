package array;

public class Leetcode_1920_Build_Array_From_Permutation {

    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int num = nums[val];
            result[i] = num;
        }
        return result;
    }
}
