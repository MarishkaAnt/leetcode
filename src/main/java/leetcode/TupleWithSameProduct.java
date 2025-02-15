package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1726. Tuple with Same Product
 */
/*
Given an array nums of distinct positive integers,
return the number of tuples (a, b, c, d) such that a * b = c * d where a, b, c,
and d are elements of nums, and a != b != c != d.

Example 1:
Input: nums = [2,3,4,6]
Output: 8
Explanation: There are 8 valid tuples:
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)

Example 2:
Input: nums = [1,2,4,5,10]
Output: 16
Explanation: There are 16 valid tuples:
(1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
(2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
(2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,5,4)
(4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)
 */
public class TupleWithSameProduct {

    public static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productMap.put(product, productMap.getOrDefault(product, 0) + 1);
            }
        }

        int count = 0;

        for (int value : productMap.values()) {
            if (value > 1) {
                count += 4 * value * (value - 1);
            }
        }

        return count;
    }
}

/*
Сначала мы проходим по всем возможным парам чисел в массиве nums и вычисляем их произведения.
Каждый раз, когда мы находим новое произведение, мы увеличиваем счетчик этого произведения в productCount.

Например, для массива {2, 3, 4, 6}:
Пара (2, 3): произведение = 6 -> productCount: {6=1}
Пара (2, 4): произведение = 8 -> productCount: {6=1, 8=1}
Пара (2, 6): произведение = 12 -> productCount: {6=1, 8=1, 12=1}
Пара (3, 4): произведение = 12 -> productCount: {6=1, 8=1, 12=2}
Пара (3, 6): произведение = 18 -> productCount: {6=1, 8=1, 12=2, 18=1}
Пара (4, 6): произведение = 24 -> productCount: {6=1, 8=1, 12=2, 18=1, 24=1}

Теперь мы проходим по всем значениям в productCount. Если количество произведений больше 1,
это означает, что существует несколько пар с одинаковым произведением.
Мы увеличиваем tupleCount на количество возможных четверок:
Для каждого произведения, встречающегося больше одного раза необходимо учесть,
что существует 8 уникальных вариантов составления кортежей:
a*b=c*d; a*b=d*c; b*a=c*d; b*a=d*c; c*d=a*b; c*d=b*a; d*c=a*b; d*c=b*a
Соответственно, итоговый вклад, каждого произведения вычисляется как 4 * frequency * (frequency - 1)

Временная сложность алгоритма O(n^2)
 */