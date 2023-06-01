import java.util.HashMap;

public class Leetcode_1_TwoSum_Using_HashMap {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {

            int complement = target - nums[j];
            if (hashMap.containsKey(complement) && (hashMap.get(complement) != j)) {
                return new int[]{j, hashMap.get(complement)};
            }
        }

        return null;
    }
}
