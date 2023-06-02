package array;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_1431_Kids_With_the_Greatest_Number_of_Candies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxItem=0;
        for (int i = 0; i < candies.length; i++) {
            if(maxItem<candies[i]) maxItem=candies[i];
        }
        for (int j = 0; j < candies.length; j++) {
            if (candies[j]+extraCandies >= maxItem) result.add(true);
            else result.add(false);
        }
        return result;
    }
}
