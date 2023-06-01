package array;

import com.google.common.truth.Truth;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Leetcode_167_Two_Sum_1_indexed_One_PassTest {

    Leetcode_167_Two_Sum_1_indexed_One_Pass sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_167_Two_Sum_1_indexed_One_Pass();

    }

    @Test
    public void resultCorrectFor3_3() {
        int[] result = {1, 2};
        int[] nums = {3, 3};
        int target = 6;
        int[] resultArray = sut.twoSum(nums, target);
        Truth.assertThat(resultArray).isEqualTo(result);
    }

    @Test
    public void resultCorrectFor2719() {
        int[] result = {1, 2};
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] resultArray = sut.twoSum(nums, target);
        Truth.assertThat(resultArray).isEqualTo(result);
    }

    @Test
    public void resultNotFound3_3() {
        int[] result = null;
        int[] nums = {3, 3};
        int target = 7;
        int[] resultArray = sut.twoSum(nums, target);
        Truth.assertThat(resultArray).isEqualTo(result);
    }

    @Test
    public void resultNotFound324() {
        int[] result = {2,3};
        int[] nums = {3, 2,4};
        int target = 6;
        int[] resultArray = sut.twoSum(nums, target);
        Truth.assertThat(resultArray).isEqualTo(result);
    }

    @After
    public void tearDown() throws Exception {
    }
}