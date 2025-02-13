package leetcode;

/**
 * 392. Is Subsequence
 */
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string
by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
 */
public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        if (s.equals(t)) {
            return true;
        }

        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }

        return sPointer == s.length();
    }
}
/*
Более оптимальное и быстрое решение с литкода, но на мой взгляд код плохо читаемый и решение не очевидное.
        int start=-1;
        for (var i =0; i < s.length();i++){
            start = t.indexOf(s.charAt(i),start+1);
            if (start==-1) return false;
        }
        return true;
 */
