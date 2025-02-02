package yandex;

/**
 * Задача B. Последовательно идущие единицы
 */
/*
Требуется найти в бинарном векторе самую длинную последовательность единиц и вывести её длину

Example 1
input: "101010"
output: 1

Example 2
input: "11"
output: 2

Example 3
input: "10111010"
output: 3

Example 4
input: "000"
output: 0

Example 5
input: ""
output: 0

 */
public class SequenceLength {

    public static int SequenceLengthSolution(String binary) {
        int maxSequence = 0;
        int current = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (1 == Character.getNumericValue(binary.charAt(i))) {
                current++;
            } else {
                current = 0;
            }
            maxSequence = Math.max(maxSequence, current);
        }

        return maxSequence;
    }

}
