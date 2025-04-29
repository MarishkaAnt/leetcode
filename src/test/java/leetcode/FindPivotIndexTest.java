package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
/*
Input: nums = [1,7,3,6,5,6]
Output: 3

Example 2:
Input: nums = [1,2,3]
Output: -1

Example 3:
Input: nums = [2,1,-1]
Output: 0
 */
class FindPivotIndexTest {

    @Test
    void pivotIndex_case1() {
        //given
        int[] input = {1,7,3,6,5,6};
        int expected = 3;

        //when
        int actual = FindPivotIndex.pivotIndex(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void pivotIndex_case2() {
        //given
        int[] input = {1,2,3};
        int expected = -1;

        //when
        int actual = FindPivotIndex.pivotIndex(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void pivotIndex_case3() {
        //given
        int[] input = {2,1,-1};
        int expected = 0;

        //when
        int actual = FindPivotIndex.pivotIndex(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}