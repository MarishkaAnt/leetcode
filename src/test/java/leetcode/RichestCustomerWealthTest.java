package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


/*
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
 */
class RichestCustomerWealthTest {

    @Test
    void maximumWealth_case1() {

        int[][] inputAccounts = {{1,2,3},{3,2,1}};
        int expected = 6;

        int actual = RichestCustomerWealth.maximumWealth(inputAccounts);

        Assertions.assertThat(actual).isEqualTo(expected);

    }

    @Test
    void maximumWealth_case2() {

        int[][] inputAccounts = {{1,5},{7,3},{3,5}};
        int expected = 10;

        int actual = RichestCustomerWealth.maximumWealth(inputAccounts);

        Assertions.assertThat(actual).isEqualTo(expected);

    }

    @Test
    void maximumWealth_case3() {

        int[][] inputAccounts = {{2,8,7},{7,1,3},{1,9,5}};
        int expected = 17;

        int actual = RichestCustomerWealth.maximumWealth(inputAccounts);

        Assertions.assertThat(actual).isEqualTo(expected);

    }


}