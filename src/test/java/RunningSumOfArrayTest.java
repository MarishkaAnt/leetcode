import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RunningSumOfArrayTest {

    @Test
    void runningSum_case1() {
        //given
        int [] input = {1,2,3,4};
        int [] expected = {1,3,6,10};
        //when
        int[] actual = RunningSumOfArray.runningSum(input);
        //then
        Assertions.assertThat(actual).isEqualTo(expected);

    }

    @Test
    void runningSum_case2() {
        //given
        int [] input = {1,1,1,1};
        int [] expected = {1,2,3,4};
        //when
        int[] actual = RunningSumOfArray.runningSum(input);
        //then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void runningSum_case3() {
        //given
        int [] input = {3,1,2,10,1};
        int [] expected = {3,4,6,16,17};
        //when
        int[] actual = RunningSumOfArray.runningSum(input);
        //then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}