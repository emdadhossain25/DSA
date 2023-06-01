import com.google.common.truth.Truth;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_1_TwoSum_Using_HashMapTest {

    Leetcode_1_TwoSum_Using_HashMap sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_1_TwoSum_Using_HashMap();

    }

    @Test
    public void resultCorrectFor3_3() {
        int[] result = {0, 1};
        int[] nums = {3, 3};
        int target = 6;
        int[] resultArray = sut.twoSum(nums, target);
        Truth.assertThat(result).isEqualTo(resultArray);
    }

    @Test
    public void resultCorrectFor2719() {
        int[] result = {0, 1};
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] resultArray = sut.twoSum(nums, target);
        Truth.assertThat(result).isEqualTo(resultArray);
    }

    @Test
    public void resultNotFound3_3() {
        int[] result = null;
        int[] nums = {3, 3};
        int target = 7;
        int[] resultArray = sut.twoSum(nums, target);
        Truth.assertThat(result).isEqualTo(resultArray);
    }

    @Test
    public void resultNotFound324() {
        int[] result = {1,2};
        int[] nums = {3, 2,4};
        int target = 6;
        int[] resultArray = sut.twoSum(nums, target);
        Truth.assertThat(result).isEqualTo(resultArray);
    }

    @After
    public void tearDown() throws Exception {
    }
}