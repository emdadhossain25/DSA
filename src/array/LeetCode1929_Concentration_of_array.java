package array;

public class LeetCode1929_Concentration_of_array {

    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length + i;
            result[i] = nums[i];
            result[j] = nums[i];
        }
        return result;
    }
}
