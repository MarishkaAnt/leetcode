import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Input: num = 14
Output: 6

Input: num = 8
Output: 4

Input: num = 123
Output: 12
 */
class NumberOfStepsToReduceNumberToZeroTest {

    @Test
    void numberOfSteps_case1() {
        //given
        int input = 14;
        int expected = 6;

        //when
        int actual = NumberOfStepsToReduceNumberToZero.numberOfSteps(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void numberOfSteps_case2() {
        //given
        int input = 8;
        int expected = 4;

        //when
        int actual = NumberOfStepsToReduceNumberToZero.numberOfSteps(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void numberOfSteps_case3() {
        //given
        int input = 123;
        int expected = 12;

        //when
        int actual = NumberOfStepsToReduceNumberToZero.numberOfSteps(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}