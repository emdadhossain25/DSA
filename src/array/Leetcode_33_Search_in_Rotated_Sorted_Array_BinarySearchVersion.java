package array;

public class Leetcode_33_Search_in_Rotated_Sorted_Array_BinarySearchVersion {


    public int search(int[] numberArray, int target) {
        int start = 0;
        int end = numberArray.length - 1;

        for (; start <= end; ) {
            int mid = (end + start) / 2;
            System.out.println(mid);
            if (numberArray[mid] == target) return mid;
            if (numberArray[start] == target) return start;
            if (numberArray[end] == target) return end;
            else {
                if (numberArray[start] > numberArray[end]) {
                    start++;
                } else if (numberArray[end] < numberArray[start]) {
                    end--;
                } else {
                    if (numberArray[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }


            }

        }

        return -1;
    }
}
