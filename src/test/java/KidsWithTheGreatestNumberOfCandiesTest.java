import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 2:
Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false]
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.

Example 3:
Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]
 */
class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    void kidsWithCandies_case1() {
        //given
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expected = List.of(true, false, false, false, false);

        //when
        List<Boolean> actual = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void kidsWithCandies_case2() {
        //given
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> expected = List.of(true, false, true);

        //when
        List<Boolean> actual = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void kidsWithCandies_case3() {
        //given
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expected = List.of(true, true, true, false, true);

        //when
        List<Boolean> actual = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}