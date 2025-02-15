package leetcode;

/**
 * 1800. Maximum Ascending Subarray Sum
 */
/*
Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
A subarray is defined as a contiguous sequence of numbers in an array.
A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1.
Note that a subarray of size 1 is ascending.

Example 1:
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.

Example 2:
Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.

Example 3:
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
 */
public class MaximumAscendingSubarraySum {
    public static int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}

/*
Подход скользящего окна (Sliding Window) - это метод, который часто используется для оптимизации задач,
связанных с подмножествами данных, особенно массивов. Он позволяет эффективно обрабатывать подмассивы
фиксированного размера или подмассивы, удовлетворяющие определенным условиям.

В данном случае, мы ищем максимальную сумму возрастающей подмассивы. Вот как это работает шаг за шагом:
1. Начнем с первой ячейки массива.
Мы будем хранить две переменные: `currentSum` (текущая сумма) и `maxSum` (максимальная сумма).
Обе переменные изначально равны первому элементу массива.

2. Проходим по массиву, начиная со второго элемента.
   - Если текущий элемент больше предыдущего (`nums[i] > nums[i - 1]`), это значит, что подмассив продолжает быть возрастающим. В таком случае мы добавляем текущий элемент к `currentSum`.
   - Если текущий элемент меньше или равен предыдущему, это значит, что предыдущий подмассив закончен, и новый подмассив начинается с текущего элемента. В этом случае мы устанавливаем `currentSum` равным текущему элементу.

3. После каждого шага мы сравниваем `currentSum` с `maxSum` и обновляем `maxSum`, если `currentSum` больше.

4. По завершении прохода по массиву `maxSum` будет содержать максимальную сумму возрастающей подмассивы.

Чтобы лучше понять этот алгоритм, рассмотрим пример:

- Начальный массив: [10, 20, 30, 5, 10, 50]
- Проход по массиву:
  - 10: `currentSum = 10`, `maxSum = 10`
  - 20: `nums[1] > nums[0]`, добавляем к `currentSum`: `currentSum = 30`, `maxSum = 30`
  - 30: `nums[2] > nums[1]`, добавляем к `currentSum`: `currentSum = 60`, `maxSum = 60`
  - 5: `nums[3] <= nums[2]`, начинаем новый подмассив: `currentSum = 5`, `maxSum = 60`
  - 10: `nums[4] > nums[3]`, добавляем к `currentSum`: `currentSum = 15`, `maxSum = 60`
  - 50: `nums[5] > nums[4]`, добавляем к `currentSum`: `currentSum = 65`, `maxSum = 65`

Таким образом, максимальная сумма возрастающей подмассивы в данном примере равна 65.
Этот алгоритм позволяет решить задачу эффективно, проходя по массиву только один раз.
 */