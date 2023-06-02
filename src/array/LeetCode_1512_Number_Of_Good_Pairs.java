package array;

import java.util.HashMap;

public class LeetCode_1512_Number_Of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (; i < nums.length; i++) {
            if (map.get(nums[i]) == null) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i]) + 1);
            if (map.get(nums[i]) > 1) result += map.get(nums[i])-1;
        }

        return result;
    }
}
