import java.util.HashMap;

public class Leetcode_167_Two_Sum_1_indexed_One_Pass {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement) + 1, i + 1};
            } else {

                map.put(nums[i], i);
            }
        }
        return null;
    }
}
