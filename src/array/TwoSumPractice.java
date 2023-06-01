import java.util.Arrays;

public class TwoSumPractice {

    // 1001  = 0111+ 0010 (9=7+2)


    public static void main(String[] args) {
        System.out.println(
                new TwoSumPractice()
        );
    }

    public TwoSumPractice() {
        int[] nums =
                {3, 2, 77, 33, 20, 11, 100, 99, 2232, 4, 312, -21, -23, 2123};
        int target = 6;
//        result(nums, target);

    }


    public int[] result(int[] nums, int target) {

        int resultIndex = 0;
        int[] result = {};
        int[] sortedArray = java.util.Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);
        int start = 0;
        int end = sortedArray.length - 1;
        while (start < end) {
            if (sortedArray[start] + sortedArray[end] == target) {
                result = new int[2];
                int startValue = sortedArray[start];
                int endValue = sortedArray[end];
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == startValue) result[resultIndex++] = i;
                    else if (nums[i] == endValue) result[resultIndex++] = i;
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





















