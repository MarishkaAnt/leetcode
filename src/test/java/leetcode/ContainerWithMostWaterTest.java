package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1
 */
class ContainerWithMostWaterTest {

    @Test
    void maxArea_case1() {
        //given
        int[] input = {1, 1};
        int expected = 1;

        //when
        int actual = ContainerWithMostWater.maxArea(input);

        //then
        Assertions.assertThat(actual).isEqualTo(expected);

    }

    @Test
    void maxArea_case2() {
        //given
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;

        //when
        int actual = ContainerWithMostWater.maxArea(input);

        //then
        Assertions.assertThat(actual).isEqualTo(expected);

    }
}