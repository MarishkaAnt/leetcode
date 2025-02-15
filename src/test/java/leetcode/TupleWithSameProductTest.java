package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*Example 1:
Input: nums = [2,3,4,6]
Output: 8

Example 2:
Input: nums = [1,2,4,5,10]
Output: 16
 */
class TupleWithSameProductTest {

    @Test
    void tupleSameProduct_case1() {
        //given
        int[] input = {2, 3, 4, 6};
        int expected = 8;
        //when
        int actual = TupleWithSameProduct.tupleSameProduct(input);
        //then
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void tupleSameProduct_case2() {
        //given
        int[] input = {1, 2, 4, 5, 10};
        int expected = 16;
        //when
        int actual = TupleWithSameProduct.tupleSameProduct(input);
        //then
        assertThat(actual).isEqualTo(expected);

    }
}