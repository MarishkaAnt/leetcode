package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
class ProductOfArrayExceptSelfTest {

    @Test
    void productExceptSelf_case1() {
        //given
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};

        //when
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(nums);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void productExceptSelf_case2() {
        //given
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};

        //when
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(nums);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void productExceptSelf_case3() {
        //given
        int[] nums = {10, -10, 1, 1};
        int[] expected = {-10, 10, -100, -100};

        //when
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(nums);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}