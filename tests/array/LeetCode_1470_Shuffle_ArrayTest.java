package array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode_1470_Shuffle_ArrayTest {
    LeetCode_1470_Shuffle_Array sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode_1470_Shuffle_Array();
    }

    @Test
    public void testShuffle() {
        int[] nums = {2,5,1,3,4,7};
        int[] result= {2,3,5,4,1,7};
        int n = 3;
        Assert.assertArrayEquals(result,
                sut.shuffle(nums, n));
    }

    @Test
    public void testShuffle2() {
        int[] nums = {1,2,3,4,4,3,2,1};
        int[] result= {1,4,2,3,3,2,4,1};
        int n = 4;
        Assert.assertArrayEquals(result,
                sut.shuffle(nums, n));
    }

    @After
    public void tearDown() throws Exception {

    }
}