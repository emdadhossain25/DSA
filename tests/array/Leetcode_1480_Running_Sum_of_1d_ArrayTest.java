package array;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_1480_Running_Sum_of_1d_ArrayTest {
    Leetcode_1480_Running_Sum_of_1d_Array sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_1480_Running_Sum_of_1d_Array();
    }

    @Test
    public void runningSum() {
        int[] nums = {1,2,3,4};
        int[] result = {1, 3, 6, 10};
        Truth.assertThat(sut.runningSum(nums)).isEqualTo(result);
    }
}