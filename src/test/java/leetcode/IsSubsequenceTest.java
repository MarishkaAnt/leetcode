package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IsSubsequenceTest {

    @Test
    void isSubsequence_case1() {
        //given
        String s = "abc";
        String t = "pqr";
        boolean expected = false;

        //when
        boolean actual = IsSubsequence.isSubsequence(s, t);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void isSubsequence_case2() {
        //given
        String s = "abc";
        String t = "ahbgdc";
        boolean expected = true;

        //when
        boolean actual = IsSubsequence.isSubsequence(s, t);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void isSubsequence_case3() {
        //given
        String s = "acb";
        String t = "ahbgdc";
        boolean expected = false;

        //when
        boolean actual = IsSubsequence.isSubsequence(s, t);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}