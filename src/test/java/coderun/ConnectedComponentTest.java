package coderun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Например:
ввод:
6 4
3 1
1 2
5 4
2 3
вывод:
3
3
1 2 3
2
4 5
1
6
 */
class ConnectedComponentTest {

    @Test
    void connectedComponent_case1() {
        //given
        String[] input = {"6 4", "3 1", "1 2", "5 4", "2 3"};
        String expected = "3\n" + "3\n" + "1 2 3 \n" + "2\n" + "4 5 \n" + "1\n" + "6 \n";

        //when
        String actual = ConnectedComponent.connectedComponent(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void connectedComponent_case2() {
        //given
        String[] input = {"6 4", "4 2", "1 4", "6 4", "3 6"};
        String expected = "2\n" + "5\n" + "1 2 3 4 6 \n" + "1\n" + "5 \n";

        //when
        String actual = ConnectedComponent.connectedComponent(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void connectedComponent_case3() {
        //given
        String[] input = {"4 2", "2 4", "3 4"};
        String expected = "2\n" + "1\n" + "1 \n" + "3\n" + "2 3 4 \n";

        //when
        String actual = ConnectedComponent.connectedComponent(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}