package array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_1920_Build_Array_From_PermutationTest {

    Leetcode_1920_Build_Array_From_Permutation sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_1920_Build_Array_From_Permutation();
    }

    @Test
    public void testbuildArray() {
        int[] nums = {0, 2, 1, 5, 3, 4};
        Assert.assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, sut.buildArray(nums));

    }

    @After
    public void tearDown() throws Exception {
    }
}