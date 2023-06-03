package array;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_674_Longest_Continous_Increasing_SubsequenceTest {

    Leetcode_674_Longest_Continous_Increasing_Subsequence sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_674_Longest_Continous_Increasing_Subsequence();
    }

    @Test
    public void findLengthOfLCIS() {
        int[] nums = {1, 3, 5, 4, 7};
        int result = 3;
        Truth.assertThat(sut.findLengthOfLCIS(nums)).isEqualTo(
                result
        );
    }

    @Test
    public void findLengthOfLCIS2() {
        int[] nums = {1, 3, 5, 7};
        int result = 4;
        Truth.assertThat(sut.findLengthOfLCIS(nums)).isEqualTo(
                result
        );
    }

    @Test
    public void findLengthOfLCIS3() {
        int[] nums = {2, 2, 2, 2, 2};
        int result = 1;
        Truth.assertThat(sut.findLengthOfLCIS(nums)).isEqualTo(
                result
        );
    }
}