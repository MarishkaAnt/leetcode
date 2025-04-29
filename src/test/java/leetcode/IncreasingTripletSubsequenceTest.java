package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
/*
Example 1:
Input: nums = [1,2,3,4,5]
Output: true

Example 2:
Input: nums = [5,4,3,2,1]
Output: false

Example 3:
Input: nums = [2,1,5,0,4,6]
Output: true
 */
class IncreasingTripletSubsequenceTest {

    @Test
    void increasingTriplet_case1() {
        //given
        int[] input = {1,2,3,4,5};
        boolean expected = true;

        //when
        boolean actual = IncreasingTripletSubsequence.increasingTriplet(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void increasingTriplet_case2() {
        //given
        int[] input = {5,4,3,2,1};
        boolean expected = false;

        //when
        boolean actual = IncreasingTripletSubsequence.increasingTriplet(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void increasingTriplet_case3() {
        //given
        int[] input = {2,1,5,0,4,6};
        boolean expected = true;

        //when
        boolean actual = IncreasingTripletSubsequence.increasingTriplet(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void increasingTriplet_case4() {
        //given
        int[] input = {20,100,10,12,5,13};
        boolean expected = true;

        //when
        boolean actual = IncreasingTripletSubsequence.increasingTriplet(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void increasingTriplet_case5() {
        //given
        int[] input = {5,1,5,5,2,5,4};
        boolean expected = true;

        //when
        boolean actual = IncreasingTripletSubsequence.increasingTriplet(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void increasingTriplet_case6() {
        //given
        int[] input = {1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 100000000};
        boolean expected = true;

        //when
        boolean actual = IncreasingTripletSubsequence.increasingTriplet(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void increasingTriplet_case7() {
        //given
        int[] input = {1, 0, 0, 0, 0, 0, -1, 100000000};
        boolean expected = false;

        //when
        boolean actual = IncreasingTripletSubsequence.increasingTriplet(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}