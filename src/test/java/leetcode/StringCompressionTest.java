package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 1:
Input: chars = ['a','a','b','b','c','c','c']
Output: 6

Example 2:
Input: chars = ['a']
Output: 1

Example 3:
Input: chars = ['a','b','b','b','b','b','b','b','b','b','b','b','b']
Output: 4
 */
class StringCompressionTest {

    @Test
    void compress_case1() {
        //given
        char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int expected = 6;

        //when
        int actual = StringCompression.compress(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void compress_case2() {
        //given
        char[] input = {'a'};
        int expected = 1;

        //when
        int actual = StringCompression.compress(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void compress_case3() {
        //given
        char[] input = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int expected = 4;

        //when
        int actual = StringCompression.compress(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void compress_case4() {
        //given
        char[] input = {'a', 'b'};
        int expected = 2;

        //when
        int actual = StringCompression.compress(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void compress_case5() {
        //given
        char[] input = {'a', 'b', 'a', 'b'};
        int expected = 4;

        //when
        int actual = StringCompression.compress(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}