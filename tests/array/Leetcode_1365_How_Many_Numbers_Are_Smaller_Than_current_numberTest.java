package array;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_1365_How_Many_Numbers_Are_Smaller_Than_current_numberTest {
    Leetcode_1365_How_Many_Numbers_Are_Smaller_Than_current_number sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_1365_How_Many_Numbers_Are_Smaller_Than_current_number();
    }

    @Test
    public void smallerNumbersThanCurrent() {
        int[] nums = {8,1,2,2,3};
        int[] result = {4,0,1,1,3};
        Truth.assertThat(sut.smallerNumbersThanCurrent(nums)).isEqualTo(
                result
        );
    }

    @Test
    public void smallerNumbersThanCurrent2() {
        int[] nums = {7,7,7,7};
        int[] result = {0,0,0,0};
        Truth.assertThat(sut.smallerNumbersThanCurrent(nums)).isEqualTo(
                result
        );
    }
}