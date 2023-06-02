package array;

public class LeetCode_1470_Shuffle_Array {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i=0;

        int j =0;
        for(;i<nums.length;){
           result[i++]=nums[j++];
           result[i++]=nums[n++];
       }
        return result;
    }
}
