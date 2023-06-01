import java.util.Arrays;

public class LeetCode_1_TwoSum {


    public int[] twoSum(
            int[] nums,
            int target
    ) {

        int resultIndex = 0;
        int[] result = null;

        //creating a copy of nums
        int[] sortedArray = java.util.Arrays.copyOf(nums
                , nums.length);

        // sorting the copied array
        Arrays.sort(sortedArray);

        int start = 0;
        int end = sortedArray.length - 1;

        // loop for binary search (using for loop)
        for (; start < end; ) {
            if (sortedArray[start] + sortedArray[end] == target) {
                result = new int[2];
                for (int i = 0; i < nums.length; i++) {
                    if (sortedArray[start] == nums[i]) result[resultIndex++] = i;
                    else if (sortedArray[end] == nums[i]) result[resultIndex++] = i;
                    if (resultIndex >= 2) break;
                }
                break;
            } else if (sortedArray[start] + sortedArray[end] > target) {
                end -= 1;
            } else {
                start += 1;
            }

        }


        return result;
    }

}
