package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Input: ransomNote = "a", magazine = "b"
Output: false

Input: ransomNote = "aa", magazine = "ab"
Output: false

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
public class RansomNoteTest {
    @Test
    void canConstruct_case1() {
        //given
        String ransomNote = "a";
        String magazine = "b";
        boolean expected = false;

        //when
        boolean actual = RansomNote.canConstruct(ransomNote, magazine);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void canConstruct_case2() {
        //given
        String ransomNote = "aa";
        String magazine = "ab";
        boolean expected = false;

        //when
        boolean actual = RansomNote.canConstruct(ransomNote, magazine);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void canConstruct_case3() {
        //given
        String ransomNote = "aa";
        String magazine = "aab";
        boolean expected = true;

        //when
        boolean actual = RansomNote.canConstruct(ransomNote, magazine);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void canConstruct_case4() {
        //given
        String ransomNote = "i kill you";
        String magazine = "if the weather is fine unlike love and toy";
        boolean expected = true;

        //when
        boolean actual = RansomNote.canConstruct(ransomNote, magazine);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void canConstruct_case5() {
        //given
        String ransomNote = "i kill you";
        String magazine = "if the weather is fine";
        boolean expected = false;

        //when
        boolean actual = RansomNote.canConstruct(ransomNote, magazine);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void canConstruct_case6() {
        //given
        String ransomNote = "ghyuok";
        String magazine = "kfkghfffyfuokbg";
        boolean expected = true;

        //when
        boolean actual = RansomNote.canConstruct(ransomNote, magazine);

        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void canConstruct_case7() {
        //given
        String ransomNote = "ghyuok";
        String magazine = "alksasaslals";
        boolean expected = false;

        //when
        boolean actual = RansomNote.canConstruct(ransomNote, magazine);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}
