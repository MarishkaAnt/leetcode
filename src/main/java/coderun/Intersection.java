package coderun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 61. Пересечение множеств
 */
/*
Даны два списка чисел, которые могут содержать до 10000 чисел каждый. Выведите все числа, которые входят как в первый,
так и во второй список в порядке возрастания.

Формат ввода
Ввод: два списка целых чисел. Все числа каждого списка находятся на отдельной строке.

Формат вывода
Вывод: строка

Например:
ввод:
1 3 2
4 3 2
вывод:
2 3
 */
public class Intersection {
    public static String intersection(String[] input) {

        String[] firstLineElements = input[0].split(" ");
        String[] secondLineElements = input[1].split(" ");
        int[] arr1 = new int[firstLineElements.length];
        int[] arr2 = new int[secondLineElements.length];
        for (int i = 0; i < firstLineElements.length; i++) {
            String s = firstLineElements[i];
            arr1[i] = Integer.parseInt(s);
        }
        for (int i = 0; i < secondLineElements.length; i++) {
            String s = secondLineElements[i];
            arr2[i] = Integer.parseInt(s);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (Integer element : intersection) {
            result.append(element).append(" ");
        }

        return result.toString().strip();
    }
}
