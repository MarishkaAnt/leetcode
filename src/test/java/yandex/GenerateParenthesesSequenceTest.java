package yandex;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/*
Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 */
class GenerateParenthesesSequenceTest {

    @Test
    void generateParenthesis_case1() {
        //given
        int n = 1;
        List<String> expected = List.of("()");
        //when
        List<String> actual = GenerateParenthesesSequence.generateParenthesis(n);
        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void generateParenthesis_case2() {
        //given
        int n = 2;
        List<String> expected = List.of("(())","()()");
        //when
        List<String> actual = GenerateParenthesesSequence.generateParenthesis(n);
        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void generateParenthesis_case3() {
        //given
        int n = 3;
        List<String> expected = List.of("((()))","(()())","(())()","()(())","()()()");
        //when
        List<String> actual = GenerateParenthesesSequence.generateParenthesis(n);
        //then
        assertThat(actual).isEqualTo(expected);
    }
}