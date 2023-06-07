package binary_search;

public class Leetcode_33_Search_in_Rotated_Sorted_Array_BinarySearchVersion {
    int search(int nums[], int target) {

        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        while (lo < hi) {
            int mid =  (hi +lo) / 2;
            if (nums[mid]>nums[hi]) lo=mid+1;
            else hi = mid;
        }
        int rot = lo;
        lo = 0;
        hi = n - 1;
        for (; lo <= hi; ) {

            int mid = (hi + lo) / 2;
            int realMid = (rot + mid) % n;
            if (nums[realMid] == target) return realMid;
            else if (nums[realMid] < target) lo = mid + 1;
            else hi = mid - 1;

        }

        return -1;

    }
};