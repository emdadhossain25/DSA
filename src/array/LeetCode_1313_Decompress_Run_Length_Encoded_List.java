package array;

import java.util.Arrays;

public class LeetCode_1313_Decompress_Run_Length_Encoded_List {

    public int[] decompressRLElist(int[] nums) {
        int[] result = new int[0];
        int i = 0;
        int count = -1;
        int previousLength = 0;

        while (i < nums.length) {
            if (i == 0 || i % 2 == 0) {
                //creating new length of result;
                count = nums[i];
                previousLength = result.length;
                result =
                        Arrays.copyOf(
                                result,
                                result.length + nums[i]);
            } else {
                if (count != -1) {
                    int j = 0;
                    while (j < count) {
                        result[previousLength + j++] = nums[i];
                    }
                }

            }
            i++;
        }
        return result;
    }
}
