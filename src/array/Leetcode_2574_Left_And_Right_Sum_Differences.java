package array;

public class Leetcode_2574_Left_And_Right_Sum_Differences {
    int[] resultArray = null;
    int[] leftArray, rightArray;
    int leftSum = 0, rightSum = 0;

    public int[] leftRightDifference(int[] nums) {
        resultArray = new int[nums.length];
        leftArray = new int[nums.length];
        rightArray = new int[nums.length];
        int i = 0, j = nums.length - 1;
        for (; i < nums.length && j > -1; i++, j--) {

            leftSum = leftSum + nums[i];
            leftArray[i] = leftSum;

            rightSum = rightSum + nums[j];
            rightArray[j] = rightSum;
        }
        for (int k = 0; k < nums.length; k++) {
            if (leftArray[k] > rightArray[k]) resultArray[k] = leftArray[k] - rightArray[k];
            else resultArray[k] = rightArray[k] - leftArray[k];
        }

        return resultArray;
    }
}
