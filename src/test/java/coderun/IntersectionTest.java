package coderun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntersectionTest {

    @Test
    void intersection_case1() {
        //given
        String[] input = {"1 3 2", "4 3 2"};
        String expected = "2 3";

        //when
        String actual = Intersection.intersection(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void intersection_case2() {
        //given
        String[] input = {"1 2 6 4 5 7", "10 2 3 4 8"};
        String expected = "2 4";

        //when
        String actual = Intersection.intersection(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void intersection_case3() {
        //given
        String[] input = {"1", "2"};
        String expected = "";

        //when
        String actual = Intersection.intersection(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void intersection_case4() {
        //given
        String[] input = {"1 2 3 5 6", "6 5"};
        String expected = "5 6";

        //when
        String actual = Intersection.intersection(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}