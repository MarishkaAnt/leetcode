package coderun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AverageElementTest {

    @Test
    void averageElement_case1() {
        //given
        String input = "1 2 3";
        String expected = "2";

        //when
        String actual = AverageElement.averageElement(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void averageElement_case2() {
        //given
        String input = "-100 10000 0";
        String expected = "0";

        //when
        String actual = AverageElement.averageElement(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void averageElement_case3() {
        //given
        String input = "3 2 3";
        String expected = "3";

        //when
        String actual = AverageElement.averageElement(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void averageElement_case4() {
        //given
        String input = "3 3 3";
        String expected = "3";

        //when
        String actual = AverageElement.averageElement(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void averageElement_case5() {
        //given
        String input = "-3 -2 0";
        String expected = "-2";

        //when
        String actual = AverageElement.averageElement(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void averageElement_case6() {
        //given
        String input = "-100 -2 -5";
        String expected = "-5";

        //when
        String actual = AverageElement.averageElement(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}