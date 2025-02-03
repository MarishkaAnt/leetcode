import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""
 */
class GreatestCommonDivisorTest {

    @Test
    void gcdOfStrings_case1() {
        //given
        String str1 = "ABCABC";
        String str2 = "ABC";
        String expected = "ABC";

        //when
        String actual = GreatestCommonDivisor.gcdOfStrings(str1, str2);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void gcdOfStrings_case2() {
        //given
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String expected = "AB";

        //when
        String actual = GreatestCommonDivisor.gcdOfStrings(str1, str2);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void gcdOfStrings_case3() {
        //given
        String str1 = "LEET";
        String str2 = "CODE";
        String expected = "";

        //when
        String actual = GreatestCommonDivisor.gcdOfStrings(str1, str2);

        //then
        assertThat(actual).isEqualTo(expected);
    }

}