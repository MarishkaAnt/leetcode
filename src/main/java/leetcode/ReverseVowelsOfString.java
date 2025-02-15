package leetcode;

/**
 * 345. Reverse Vowels of a String
 */
/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:
Input: s = "leetcode"
Output: "leotcede"
 */
public class ReverseVowelsOfString {

    public static String reverseVowels(String s) {
/*
        Мое решение:
        int length = s.length();
        int j = length - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {

            char c = s.charAt(i);
            if (isInVowelsString(c)) {
                for (; j >= 0; j--) {
                    char c1 = s.charAt(j);
                    if (isInVowelsString(c1)) {
                       sb.append(c1);
                       j--;
                       break;
                    }
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
        Ниже решение от Copilot:
        */
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            while (i < j && !isInVowelsString(chars[i])) {
                i++;
            }
            while (i < j && !isInVowelsString(chars[j])) {
                j--;
            }
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    private static boolean isInVowelsString(char c) {
        String VOWELS = "aeiouAEIOU";
        return VOWELS.indexOf(c) != -1;
    }
}
