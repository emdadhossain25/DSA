package array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode_1313_Decompress_Run_Length_Encoded_ListTest {

    LeetCode_1313_Decompress_Run_Length_Encoded_List sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode_1313_Decompress_Run_Length_Encoded_List();
    }

    @Test
    public void decompressRLElist() {
        int[] nums = {1, 2, 3, 4};
        int[] result = {2, 4, 4, 4};
        Assert.assertArrayEquals(
                result,
                sut.decompressRLElist(nums)
        );
    }
    @Test
    public void decompressRLElist2() {
        int[] nums = {1,1,2,3};
        int[] result = {1,3,3};
        Assert.assertArrayEquals(
                result,
                sut.decompressRLElist(nums)
        );
    }
}