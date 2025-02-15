package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 1:
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.

Example 2:
Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.

Example 3:
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
 */
class MaximumAscendingSubarraySumTest {

    @Test
    void maxAscendingSum_case1() {
        //given
        int[] input = {10,20,30,5,10,50};
        int expected = 65;

        //when
        int actual = MaximumAscendingSubarraySum.maxAscendingSum(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void maxAscendingSum_case2() {
        //given
        int[] input = {10,20,30,40,50};
        int expected = 150;

        //when
        int actual = MaximumAscendingSubarraySum.maxAscendingSum(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void maxAscendingSum_case3() {
        //given
        int[] input = {12,17,15,13,10,11,12};
        int expected = 33;

        //when
        int actual = MaximumAscendingSubarraySum.maxAscendingSum(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void maxAscendingSum_case4() {
        //given
        int[] input = {1,2,3,2,4,5,1,2};
        int expected = 11;

        //when
        int actual = MaximumAscendingSubarraySum.maxAscendingSum(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}