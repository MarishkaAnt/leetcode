package coderun;

import java.util.Arrays;

/**
 * 1. Средний элемент
 */
/*
В единственной строке записаны три целых числа a, b, c (−1000 ≤ a, b, c ≤ 1000), числа разделены одиночными пробелами.
Выведите число, которое будет стоять между двумя другими после упорядочивания.
 */
public class AverageElement {

    public static String averageElement(String input) {

/*      Простое решение:
        String[] parts = input.split(" ");
        int[] nums = new int[parts.length];
        for (int j = 0; j < parts.length; j++) {
            String part = parts[j];
            nums[j] = Integer.parseInt(part);
        }
        Arrays.sort(nums);
        int num = nums[1];

        Более элегантное и более быстрое решение:        */
        return Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .skip(1)
                .mapToObj(Integer::toString)
                .findFirst()
                .orElse("");
    }

}
