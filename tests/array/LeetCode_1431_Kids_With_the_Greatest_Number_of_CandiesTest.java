package array;

import com.google.common.truth.Truth;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LeetCode_1431_Kids_With_the_Greatest_Number_of_CandiesTest {

    LeetCode_1431_Kids_With_the_Greatest_Number_of_Candies sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode_1431_Kids_With_the_Greatest_Number_of_Candies();
    }

    @Test
    public void testKidsWithCandies() {
        int[] candies = {2, 3, 5, 1, 3};
        ArrayList<Boolean> result = new ArrayList<>();
        result.add(true);
        result.add(true);
        result.add(true);
        result.add(false);
        result.add(true);
        int extraCandies = 3;

        Truth.assertThat(result).isEqualTo(sut.kidsWithCandies(candies, extraCandies));
    }

    @Test
    public void testKidsWithCandies2() {
        int[] candies = {4,2,1,1,2};
        ArrayList<Boolean> result = new ArrayList<>();
        result.add(true);
        result.add(false);
        result.add(false);
        result.add(false);
        result.add(false);
        int extraCandies = 1;

        Truth.assertThat(result).isEqualTo(sut.kidsWithCandies(candies, extraCandies));
    }

    @Test
    public void testKidsWithCandies3() {
        int[] candies = {12,1,12};
        ArrayList<Boolean> result = new ArrayList<>();
        result.add(true);
        result.add(false);
        result.add(true);

        int extraCandies = 10;

        Truth.assertThat(result).isEqualTo(sut.kidsWithCandies(candies, extraCandies));
    }

}