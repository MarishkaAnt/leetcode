package coderun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 7. Поиск в глубину
 */
/*
Дан неориентированный граф, возможно с петлями и кратными ребрами.
Необходимо найти компоненту связности, содержащую вершину с номером 1.

Формат ввода:
В первой строке записаны два целых числа N (1≤N≤1000) и M (0≤M≤5×100000) — количество вершин и ребер в графе.
В последующих M строках перечислены ребра — пары чисел, определяющие номера вершин, которые соединяют ребра.
Вершины нумеруются с единицы.

Формат вывода
В первой строке выведите число K — количество вершин в компоненте связности.
Во второй строке выведите K целых чисел — вершины компоненты связности, перечисленные в порядке возрастания номеров.

Пример 1:
4 5
2 2
3 4
2 3
1 3
2 4
Вывод:
4
1 2 3 4
 */
public class DepthFirstSearch {
    public static String depthFirstSearch(String[] input) {

        StringBuilder result = new StringBuilder();

        String[] firstLine = input[0].split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String[] edge = input[i + 1].split(" ");
            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n + 1];
        List<Integer> component = new ArrayList<>();

        dfs(1, graph, visited, component);
        Collections.sort(component);

        result.append(component.size()).append("\n");
        for (int vertex : component) {
            result.append(vertex).append(" ");
        }
        return result.toString();

    }
    private static void dfs(int vertex, List<List<Integer>> graph, boolean[] visited, List<Integer> component) {
        visited[vertex] = true;
        component.add(vertex);

        for (int neighbor : graph.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, component);
            }
        }
    }

}
