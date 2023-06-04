package array;

import java.util.Arrays;

public class Leetcode_1365_How_Many_Numbers_Are_Smaller_Than_current_number {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int[] frequency = new int[101];

        //storing the frequency
        for (int num : nums) {
            frequency[num]++;
        }

        // intuition check frequency of all frequencies of all lesser numbers of frequency[i]
        // swap operation for
        int lesserNumberAggregate = 0;
        int currenNumberAggregate = 0;
        for (int j = 0; j < frequency.length; j++) {
            currenNumberAggregate = currenNumberAggregate + frequency[j];
            frequency[j] = lesserNumberAggregate;
            lesserNumberAggregate = currenNumberAggregate;
        }


        //storing result from frequency array
        for (int i = 0; i < nums.length; i++) {
            result[i] = frequency[nums[i]];
        }
        return result;
    }
}
