import com.google.common.truth.Truth;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumPracticeTest {
    public TwoSumPractice sut;
    int[] nums =
            {3, 2, 77, 33, 20, 11, 100, 99, 2232, 4, 312, -21, -23, 2123};
    int target = 6;

//    int[] nums = {3,3};
//    int target=6;


    @Before
    public void setUp() throws Exception {
        sut = new TwoSumPractice();
    }

    @Test
    public void test_ResultMethod_isNotEmpty() {
        Truth.assertThat(sut.result(nums, target)).isNotEmpty();
    }


    //
    @Test
    public void test_ResultMethod_ResultArray() {
        Assert.assertArrayEquals(
                new int[]{1, 9},
                sut.result(nums, target));
    }



    @After
    public void tearDown() throws Exception {
    }
}