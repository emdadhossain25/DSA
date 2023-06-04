package array;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_1720_Decode_Xor_ArrayTest {

    Leetcode_1720_Decode_Xor_Array sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_1720_Decode_Xor_Array();
    }

    @Test
    public void decode() {
        int[] encoded = {1, 2, 3};
        int first = 1;
        int[] result = {1,0,2,1};
        Truth.assertThat(sut.decode(encoded, first)).isEqualTo(
                result
        );
    }
    @Test
    public void decode2() {
        int[] encoded = {6,2,7,3};
        int first = 4;
        int[] result = {4,2,0,7,4};
        Truth.assertThat(sut.decode(encoded, first)).isEqualTo(
                result
        );
    }
}