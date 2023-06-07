package array;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_2652_Sum_multiplesTest {

    Leetcode_2652_Sum_multiples sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_2652_Sum_multiples();
    }

    @Test
    public void sumOfMultiples() {
        int n = 9;
        Truth.assertThat(sut.sumOfMultiples(n))
                .isEqualTo(30);
    }

    @Test
    public void sumOfMultiples2() {
        int n = 10;
        Truth.assertThat(sut.sumOfMultiples(n))
                .isEqualTo(40);
    }

    @Test
    public void sumOfMultiples3() {
        int n = 7;
        Truth.assertThat(sut.sumOfMultiples(n))
                .isEqualTo(21);
    }
}