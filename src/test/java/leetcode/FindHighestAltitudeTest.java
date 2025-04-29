package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 1:
Input: gain = [-5,1,5,0,-7]
Output: 1

Example 2:
Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
 */
class FindHighestAltitudeTest {

    @Test
    void largestAltitude_case1() {
        //given
        int[] input = {-5, 1, 5, 0, -7};
        int expected = 1;

        //when
        int actual = FindHighestAltitude.largestAltitude(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void largestAltitude_case2() {
        //given
        int[] input = {-4, -3, -2, -1, 4, 3, 2};
        int expected = 0;

        //when
        int actual = FindHighestAltitude.largestAltitude(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}