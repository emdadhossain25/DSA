package array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode1929_Concentration_of_arrayTest {

    LeetCode1929_Concentration_of_array sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode1929_Concentration_of_array();
    }


    @Test
    public void testgetConcatenation1() {
        int[] nums = {1, 2, 1};
        int[] result = {1, 2, 1, 1, 2, 1};
        Assert.assertArrayEquals(result,
                sut.getConcatenation(nums));
        ;
    }

    @Test
    public void testgetConcatenation2() {
        int[] nums = {1, 3, 2, 1};
        int[] result = {1, 3, 2, 1, 1, 3, 2, 1};
        Assert.assertArrayEquals(result,
                sut.getConcatenation(nums));
        ;
    }

    @After
    public void tearDown() throws Exception {
    }
}