package array;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_1629_Slowest_keyTest {
    Leetcode_1629_Slowest_key sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_1629_Slowest_key();
    }

    @Test
    public void testSlowestKey() {
        int[] releaseTimes = {9,29,49,50};
        String keyPressed = "cbcd";
        char result = 'c';
        Truth.assertThat(sut.slowestKey(releaseTimes, keyPressed))
                .isEqualTo(result);
    }

    @Test
    public void testSlowestKey2() {
        int[] releaseTimes = {12,23,36,46,62};
        String keyPressed = "spuda";
        char result = 'a';
        Truth.assertThat(sut.slowestKey(releaseTimes, keyPressed))
                .isEqualTo(result);
    }
    @Test
    public void testSlowestKey3() {
        int[] releaseTimes = {23,34,43,59,62,80,83,92,97};
        String keyPressed = "qgkzzihfc";
        char result = 'q';
        Truth.assertThat(sut.slowestKey(releaseTimes, keyPressed))
                .isEqualTo(result);
    }
}