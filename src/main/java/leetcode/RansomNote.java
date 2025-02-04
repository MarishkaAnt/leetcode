package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 383. Ransom Note
 */

/*
Given two strings ransomNote and magazine,
return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> magazineCharsFrequency = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineCharsFrequency.put(c, magazineCharsFrequency.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (magazineCharsFrequency.getOrDefault(c, 0) == 0) {
                return false;
            }
            magazineCharsFrequency.put(c, magazineCharsFrequency.get(c) - 1);
        }

        return true;
    }
}

/* Эффективное решение с литкода:

   //Проверка длины строк
   if (ransomNote.length() > magazine.length()) {
       return false;
   }

   //Создается массив целых чисел длиной 128, чтобы охватить все символы ASCII (от 0 до 127). Этот массив будет использоваться для подсчета каждого символа в `magazine`.
   int[] counter = new int[128];

   //Проходим по каждому символу строки `magazine` и увеличиваем соответствующее значение в `counter` на 1. Это позволяет подсчитать количество каждого символа.
   for (char c : magazine.toCharArray()) {
       counter[c]++;
   }

    //Проходим по каждому символу строки `ransomNote`.
    //- Если значение в `counter` для текущего символа равно 0, значит, нужного символа в `magazine` не хватает, и возвращаем `false`.
    //- Если символ есть, уменьшаем его количество в `counter` на 1.
   for (char c : ransomNote.toCharArray()) {
       if (counter[c] == 0) {
           return false;
       }
       counter[c]--;
   }

   return true;

Почему это эффективно?
Массив `counter` занимает константное пространство \(O(1)\) и позволяет производить операции подсчета и проверок за линейное время \(O(n)\), где \(n\) – длины строк.

 */
