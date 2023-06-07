package binary_search;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

public class Leetcode_33_Search_in_Rotated_Sorted_Array_BinarySearchVersionTest {
    Leetcode_33_Search_in_Rotated_Sorted_Array_BinarySearchVersion sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_33_Search_in_Rotated_Sorted_Array_BinarySearchVersion();
    }

    @Test
    public void search() {
        int[] numberArray = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = 4;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }

    @Test
    public void search2() {
        int[] numberArray = {4, 5, 6, 7, 0, 1, 2};
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
        int[] numberArray = {1, 3};
        int target = 2;
        int result = -1;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }

    @Test
    public void search6() {
        int[] numberArray = {1, 3, 5};
        int target = 3;
        int result = 1;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }

    @Test
    public void search7() {
        int[] numberArray = {4, 5, 6, 7, 0, 1, 2};
        int target = 5;
        int result = 1;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }

    @Test
    public void search8() {
        int[] numberArray = {8, 1, 2, 3, 4, 5, 6, 7};
        int target = 6;
        int result = 6;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }

    @Test
    public void search9() {
        int[] numberArray = {800, 1, 2, 3, 4, 5, 6, 700, 701, 702, 703, 704,
                705, 706, 707,
                708,
                709,
                710,
                711,
                712,
                713,
                714, 715, 716, 717, 718, 719};
        int target = 6;
        int result = 6;
        Truth.assertThat(sut.search(numberArray, target)).isEqualTo(
                result
        );
    }

}