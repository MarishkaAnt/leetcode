package leetcode;

/**
 * 443. String Compression
 */
/*
Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of consecutive repeating characters in chars:
If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
Note that group lengths that are 10 or longer will be split into multiple characters in chars.
After you are done modifying the input array, return the new length of the array.
You must write an algorithm that uses only constant extra space.

Example 1:
Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

Example 2:
Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.

Example 3:
Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 */
public class StringCompression {

    public static int compress(char[] chars) {

        char prev = chars[0];
        StringBuilder sb = new StringBuilder();
        int counter = 1;

        int length = chars.length;
        if (length == 1) {
            sb.append(prev);
        }
        for (int i = 1; i < length; i++) {
            char curr = chars[i];
            if (i == length - 1) {
                sb.append(curr);
                if (counter != 1) {
                    sb.append(counter);
                }
            }
            if (curr != prev) {
                sb.append(prev);
                if (counter != 1) {
                    sb.append(counter);
                }
                counter = 1;
            } else {
                counter++;
            }
            prev = curr;
        }
        chars = sb.toString().toCharArray();
        return chars.length;
    }
}
/*
очень замудрили задачу, непонятно зачем менять исходный массив, а возвращать длину строки, задание странное
копайлот предлагает такое решение, оно подошло, но задача мне очень не понравилась:
int index = 0, count = 1;

        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[index++] = chars[i - 1]; // Записываем символ

                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[index++] = c; // Записываем количество повторений
                    }
                }
                count = 1; // Сброс счетчика
            }
        }

        return index;
 */
