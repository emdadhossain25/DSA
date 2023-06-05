package array;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

public class Leetcode_33_Search_in_Rotated_Sorted_ArrayTest {

    Leetcode_33_Search_in_Rotated_Sorted_Array_Without_BinarySearch sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_33_Search_in_Rotated_Sorted_Array_Without_BinarySearch();
    }

    @Test
    public void search() {
        int[] numberArray = {4,5,6,7,0,1,2};
        int target = 0;
        int result = 4;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }

    @Test
    public void search2() {
        int[] numberArray = {4,5,6,7,0,1,2};
        int target = 3;
        int result = -1;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }
    @Test
    public void search3() {
        int[] numberArray = {1};
        int target = 0;
        int result = -1;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }

    @Test
    public void search4() {
        int[] numberArray = {1};
        int target = 1;
        int result = 0;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }

    @Test
    public void search5() {
        int[] numberArray = {1,3};
        int target = 2;
        int result = -1;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }
}