package array;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_1389_create_target_array_in_the_given_orderTest {
    Leetcode_1389_create_target_array_in_the_given_order sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_1389_create_target_array_in_the_given_order();
    }

    @Test
    public void createTargetArray() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] result = {0, 4, 1, 3, 2};
        Truth.assertThat(sut.createTargetArray(nums, index)).isEqualTo(
                result
        );
    }
}