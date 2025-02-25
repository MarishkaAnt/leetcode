package leetcode;

/**
 * 11. Container With Most Water
 */
/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1

(насколько я поняла, нужно вернуть максимальную площадь прямоугольника, образованного между двумя такими линиями (высотой = числу),
где длина прямоугольника - это разница между индексами этих линий, а ширина =  меньшему из чисел)
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int length = height.length;
        int maxArea = 0;

        if (length < 2) {
            return 0;
        }

        int left = 0;
        int right = length - 1;

        while (left < right) {
            int curr = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(curr, maxArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;

    }
}

/*
Здесь нет необходимости в проверке всех возможных комбинаций, поэтому более эффективным будет алгоритм с использованием двух указателей,
при котором после каждого расчета площади мы перемещаем только указатель, указывающий на меньшее число из двух,
тем самым мы плавно сокращаем расстояние между линиями, но всегда гарантируем наибольшую высоту.
То есть, мы пропускаем комбинации площадей, ограниченных более низким указателем, которые нам пришлось бы считать,
если бы мы просто перебирали все варианты. Да, при таком подходе лишние площади всё равно рассчитываются, однако, мы гарантируем,
что не пропустим максимальную площадь.
 */
