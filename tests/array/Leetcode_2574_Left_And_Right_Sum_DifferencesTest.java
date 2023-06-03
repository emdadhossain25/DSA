package array;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_2574_Left_And_Right_Sum_DifferencesTest {
    Leetcode_2574_Left_And_Right_Sum_Differences sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_2574_Left_And_Right_Sum_Differences();
    }

    @Test
    public void leftRightDifference() {
        int[] nums = {10, 4, 8, 3};
        int[] result = {15, 1, 11, 22};
        Truth.assertThat(
                sut.leftRightDifference(nums)
        ).isEqualTo(result);
    }
    @Test
    public void leftRightDifference2() {
        int[] nums = {1};
        int[] result = {0};
        Truth.assertThat(
                sut.leftRightDifference(nums)
        ).isEqualTo(result);
    }
}