package array;

public class Leetcode_674_Longest_Continous_Increasing_Subsequence {
    int counter;
    int maxCounter;

    public int findLengthOfLCIS(int[] nums) {
        counter = 1;
        maxCounter = 1;

        for (int i = 0, j = 1; i < j && j < nums.length; i++, j++) {
            if (nums[i] < nums[j]) {
                counter++;
                if (maxCounter < counter) maxCounter = counter;
            } else {
                 counter = 1;
            }

        }
        return maxCounter;
    }
}
