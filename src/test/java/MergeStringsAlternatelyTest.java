import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"

Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"

Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
 */
class MergeStringsAlternatelyTest {

    @Test
    void mergeAlternately_case1() {
        //given
        String ransomNote = "abc";
        String magazine = "pqr";
        String expected = "apbqcr";

        //when
        String actual = MergeStringsAlternately.mergeAlternately(ransomNote, magazine);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mergeAlternately_case2() {
        //given
        String ransomNote = "ab";
        String magazine = "pqrs";
        String expected = "apbqrs";

        //when
        String actual = MergeStringsAlternately.mergeAlternately(ransomNote, magazine);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mergeAlternately_case3() {
        //given
        String ransomNote = "abcd";
        String magazine = "pq";
        String expected = "apbqcd";

        //when
        String actual = MergeStringsAlternately.mergeAlternately(ransomNote, magazine);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}