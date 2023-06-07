package array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Leetcode_1528_Shuffle_StringTest {

    Leetcode_1528_Shuffle_String sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_1528_Shuffle_String();
    }

    @Test
    public void restoreString() {
        String s = "abc";
        int[] indices = {0,1,2};
        String result = "abc";
        Assert.assertEquals(result, sut.restoreString(s, indices));
    }

    @Test
    public void restoreString2() {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,1,2,3};
        String result = "leetcode";
        Assert.assertEquals(result, sut.restoreString(s, indices));
    }
}