package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZeroesTest {

    @Test
    void moveZeroes_case1() {
        //given
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        //when
        int[] actual = MoveZeroes.moveZeroes(nums);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void moveZeroes_case2() {
        //given
        int[] nums = {0};
        int[] expected = {0};

        //when
        int[] actual = MoveZeroes.moveZeroes(nums);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void moveZeroes_case3() {
        //given
        int[] nums = {0, 0, 0, 0, 0, 1};
        int[] expected = {1, 0, 0, 0, 0, 0};

        //when
        int[] actual = MoveZeroes.moveZeroes(nums);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}