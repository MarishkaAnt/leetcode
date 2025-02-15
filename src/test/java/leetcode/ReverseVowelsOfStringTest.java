package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:
Input: s = "leetcode"
Output: "leotcede"
 */
class ReverseVowelsOfStringTest {

    @Test
    void reverseVowels_case1() {
        //given
        String input = "Lola";
        String expected = "Lalo";

        //when
        String actual = ReverseVowelsOfString.reverseVowels(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void reverseVowels_case2() {
        //given
        String input = "IceCreAm";
        String expected = "AceCreIm";

        //when
        String actual = ReverseVowelsOfString.reverseVowels(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void reverseVowels_case3() {
        //given
        String input = "leetcode";
        String expected = "leotcede";

        //when
        String actual = ReverseVowelsOfString.reverseVowels(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}