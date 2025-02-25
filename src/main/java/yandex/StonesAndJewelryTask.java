package yandex;

/**
 * Задача A. Камни и украшения (771. Jewels and Stones)
 */
/*
Даны две строки строчных латинских символов: строка J и строка S.
Символы, входящие в строку J, — «драгоценности», входящие в строку S — «камни».
Нужно определить, какое количество символов из S одновременно являются «драгоценностями».
Проще говоря, нужно проверить, какое количество символов из S входит в J.

Пример:
Ввод j = ab, s = aabbccd
Вывод: 4
 */
public class StonesAndJewelryTask {

    public static int stonesAndJewelrySolution(String stones, String jewels) {

        int jewelryStonesCount = 0;

        for (int i = 0; i < jewels.length(); i++) {

            char c = jewels.charAt(i);

            for (int j = 0; j < stones.length(); j++) {

                if (c == stones.charAt(j)) {
                    jewelryStonesCount++;
                }
            }
        }

        return jewelryStonesCount;
    }
}

/* Более эффективное решение:

        int jewelryStonesCount = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i))>=0){
                jewelryStonesCount++;
            }
        }

 */
