package array;

public class Leetcode_33_Search_in_Rotated_Sorted_Array {

    public int search(int[] nums, int target) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (target < nums[start]) start++;
            else if (target > nums[end]) end--;
            else if (target == nums[start]) return start;
            else if (target == nums[end]) return end;
            else {
                start++;
                end--;
            }
        }

        return result;
    }
}