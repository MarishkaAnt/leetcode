package coderun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 8. Компоненты связности
 */
/*
Дан неориентированный невзвешенный граф, состоящий из N вершин и M ребер.
Необходимо посчитать количество его компонент связности и вывести их.

Напомним:
Компонента связности в неориентированном графе - это подмножество вершин, таких что все вершины достижимы друг из друга.

Формат ввода
Во входном файле записано два числа N и M (0 < N ≤ 100000, 0 ≤ M ≤ 100000).
В следующих M строках записаны по два числа i и j (1 ≤ i, j ≤ N), которые означают, что вершины i и j соединены ребром.

Формат вывода
В первой строчке выходного файла выведите количество компонент связности.
Далее выведите сами компоненты связности в следующем формате:
в первой строке количество вершин в компоненте, во второй - сами вершины в произвольном порядке.

Например:
ввод:
6 4
3 1
1 2
5 4
2 3
вывод:
3
3
1 2 3
2
4 5
1
6
 */
public class ConnectedComponent {
    public static String connectedComponent(String[] input) {

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
        List<List<Integer>> components = new ArrayList<>();

        for (int i = 1; i < graph.size(); i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, graph, visited, component);
                Collections.sort(component);
                components.add(component);
            }
        }
        StringBuilder result = new StringBuilder();

        result.append(components.size()).append("\n");
        for (List<Integer> component : components) {
            result.append(component.size()).append("\n");
            for (int vertex : component) {
                result.append(vertex).append(" ");
            }
            result.append("\n");
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
