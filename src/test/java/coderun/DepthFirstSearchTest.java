package coderun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DepthFirstSearchTest {

    @Test
    void depthFirstSearch_case1() {
        //given
        String[] input = {"4 5", "2 2", "3 4", "2 3", "1 3", "2 4"};
        String expected = "4\n" + "1 2 3 4 ";

        //when
        String actual = DepthFirstSearch.depthFirstSearch(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void depthFirstSearch_case2() {
        //given
        String[] input = {"6 4", "1 2", "2 4", "3 6", "5 6"};
        String expected = "3\n" + "1 2 4 ";

        //when
        String actual = DepthFirstSearch.depthFirstSearch(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void depthFirstSearch_case3() {
        //given
        String[] input = {"4 2", "2 4", "3 4"};
        String expected = "1\n" + "1 ";

        //when
        String actual = DepthFirstSearch.depthFirstSearch(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}