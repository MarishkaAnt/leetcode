package yandex;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SequenceLengthTest {

    @Test
    void sequenceLengthSolution_case1() {
        //given
        String binary = "01010";
        int expectedCount = 1;
        //when
        int actual = SequenceLength.SequenceLengthSolution(binary);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);

    }

    @Test
    void sequenceLengthSolution_case2() {
        //given
        String binary = "01011";
        int expectedCount = 2;
        //when
        int actual = SequenceLength.SequenceLengthSolution(binary);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);

    }

    @Test
    void sequenceLengthSolution_case3() {
        //given
        String binary = "";
        int expectedCount = 0;
        //when
        int actual = SequenceLength.SequenceLengthSolution(binary);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);

    }

    @Test
    void sequenceLengthSolution_case4() {
        //given
        String binary = "11111";
        int expectedCount = 5;
        //when
        int actual = SequenceLength.SequenceLengthSolution(binary);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);

    }

    @Test
    void sequenceLengthSolution_case6() {
        //given
        String binary = "0000";
        int expectedCount = 0;
        //when
        int actual = SequenceLength.SequenceLengthSolution(binary);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);

    }
    @Test
    void sequenceLengthSolution_case7() {
        //given
        String binary = "101110011";
        int expectedCount = 3;
        //when
        int actual = SequenceLength.SequenceLengthSolution(binary);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);

    }
}