package array;

import java.util.ArrayList;

public class Leetcode_1389_create_target_array_in_the_given_order {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[index.length];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(index[i],nums[i]);
        }
        for (int j = 0; j < index.length; j++) {
            result[j] = arrayList.get(j);
        }
        return result;
    }
}
