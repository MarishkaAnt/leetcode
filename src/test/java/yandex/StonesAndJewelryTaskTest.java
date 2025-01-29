package yandex;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StonesAndJewelryTaskTest {

    @Test
    void stonesAndJewelrySolution_case1() {

        //given
        String j = "abc";
        String s = "aadddbbchhha";
        int expectedCount = 6;
        //when
        int actual = StonesAndJewelryTask.stonesAndJewelrySolution(s, j);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);
    }
    @Test
    void stonesAndJewelrySolution_case2() {

        //given
        String j = "abc";
        String s = "a";
        int expectedCount = 1;
        //when
        int actual = StonesAndJewelryTask.stonesAndJewelrySolution(s, j);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);
    }
    @Test
    void stonesAndJewelrySolution_case3() {

        //given
        String j = "abc";
        String s = "d";
        int expectedCount = 0;
        //when
        int actual = StonesAndJewelryTask.stonesAndJewelrySolution(s, j);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);
    }
    @Test
    void stonesAndJewelrySolution_case4() {

        //given
        String j = "aA";
        String s = "aAAbbbb";
        int expectedCount = 3;
        //when
        int actual = StonesAndJewelryTask.stonesAndJewelrySolution(s, j);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);
    }
    @Test
    void stonesAndJewelrySolution_case5() {

        //given
        String j = "z";
        String s = "ZZ";
        int expectedCount = 0;
        //when
        int actual = StonesAndJewelryTask.stonesAndJewelrySolution(s, j);
        //then
        Assertions.assertThat(actual).isEqualTo(expectedCount);
    }
}