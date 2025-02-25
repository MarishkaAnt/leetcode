package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"

Example 3:
Input: s = "a good   example"
Output: "example good a"
 */
class ReverseWordsInStringTest {

    @Test
    void reverseWords_case1() {
        //given
        String input = "the sky is blue";
        String expected = "blue is sky the";

        //when
        String actual = ReverseWordsInString.reverseWords(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void reverseWords_case2() {
        //given
        String input = "  hello world  ";
        String expected = "world hello";

        //when
        String actual = ReverseWordsInString.reverseWords(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void reverseWords_case3() {
        //given
        String input = "a good   example";
        String expected = "example good a";

        //when
        String actual = ReverseWordsInString.reverseWords(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void reverseWords_case4() {
        //given
        String input = "       ";
        String expected = "";

        //when
        String actual = ReverseWordsInString.reverseWords(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void reverseWords_case5() {
        //given
        String input = "   d     f v    ";
        String expected = "v f d";

        //when
        String actual = ReverseWordsInString.reverseWords(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}