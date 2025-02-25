package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 1:
Input: s1 = "bank", s2 = "kanb"
Output: true

Example 2:
Input: s1 = "attack", s2 = "defend"
Output: false

Example 3:
Input: s1 = "kelb", s2 = "kelb"
Output: true
 */
class AlmostEqualTest {

    @Test
    void areAlmostEqual_case1() {
        //given
        String str1 = "bank";
        String str2 = "kanb";
        boolean expected = true;

        //when
        boolean actual = AlmostEqual.areAlmostEqual(str1, str2);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void areAlmostEqual_case2() {
        //given
        String str1 = "attack";
        String str2 = "defend";
        boolean expected = false;

        //when
        boolean actual = AlmostEqual.areAlmostEqual(str1, str2);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void areAlmostEqual_case3() {
        //given
        String str1 = "kelb";
        String str2 = "kelb";
        boolean expected = true;

        //when
        boolean actual = AlmostEqual.areAlmostEqual(str1, str2);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void areAlmostEqual_case4() {
        //given
        String str1 = "bank";
        String str2 = "kant";
        boolean expected = false;

        //when
        boolean actual = AlmostEqual.areAlmostEqual(str1, str2);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}