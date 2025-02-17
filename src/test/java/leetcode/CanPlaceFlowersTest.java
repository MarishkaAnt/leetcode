package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 */
class CanPlaceFlowersTest {

    @Test
    void canPlaceFlowers_case1() {
        //given
        int[] input = {1, 0, 0, 0, 1};
        int n = 1;
        boolean expected = true;

        //when
        boolean actual = CanPlaceFlowers.canPlaceFlowers(input, n);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canPlaceFlowers_case2() {
        //given
        int[] input = {1, 0, 0, 0, 1};
        int n = 2;
        boolean expected = false;

        //when
        boolean actual = CanPlaceFlowers.canPlaceFlowers(input, n);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canPlaceFlowers_case3() {
        //given
        int[] input = {0, 0, 0};
        int n = 1;
        boolean expected = true;

        //when
        boolean actual = CanPlaceFlowers.canPlaceFlowers(input, n);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canPlaceFlowers_case4() {
        //given
        int[] input = {1, 0, 1, 0, 1, 0, 1};
        int n = 1;
        boolean expected = false;

        //when
        boolean actual = CanPlaceFlowers.canPlaceFlowers(input, n);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}