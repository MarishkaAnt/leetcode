package yandex;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача D. Генерация скобочных последовательностей (22. Generate Parentheses)
 */
/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
Input: n = 1
Output: ["()"]
 */
public class GenerateParenthesesSequence {

    public static List<String> generateParenthesis(int n) {

        List<String> currentSequence = new ArrayList<>();
        return generate(currentSequence, "", 0, 0, n);
    }

    private static List<String> generate(List<String> list, String curr, int open, int closed, int n) {
        if (curr.length() == 2 * n) {
            list.add(curr);
            return list;
        }
        if (open < n) {
            generate(list, curr + "(", open + 1, closed, n);
        }
        if (closed < open) {
            generate(list, curr + ")", open, closed + 1, n);
        }
        return list;
    }

}

