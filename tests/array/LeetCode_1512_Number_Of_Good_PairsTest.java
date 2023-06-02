package array;

import com.google.common.truth.Truth;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode_1512_Number_Of_Good_PairsTest {

    LeetCode_1512_Number_Of_Good_Pairs sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode_1512_Number_Of_Good_Pairs();
    }


    @Test
    public void testNumIdenticalPairs() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = 4;
        Truth.assertThat(sut.numIdenticalPairs(nums)).isEqualTo(result);
    }
    @Test
    public void testNumIdenticalPairs2() {
        int[] nums = {1,1,1,1};
        int result = 6;
        Truth.assertThat(sut.numIdenticalPairs(nums)).isEqualTo(result);
    }
}