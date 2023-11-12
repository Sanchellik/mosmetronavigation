package ru.gozhan.mosmetronavigation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetroGraph {
    private Map<Integer, List<Integer>> adjacencyList;

    public MetroGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addConnection(int station1, int station2) {
        // Убеждаемся, что для обеих станций есть списки смежности
        adjacencyList.putIfAbsent(station1, new ArrayList<>());
        adjacencyList.putIfAbsent(station2, new ArrayList<>());

        // Добавляем соединение от station1 к station2, если его еще нет
        if (!adjacencyList.get(station1).contains(station2)) {
            adjacencyList.get(station1).add(station2);
        }

        // Добавляем соединение от station2 к station1, если его еще нет
        if (!adjacencyList.get(station2).contains(station1)) {
            adjacencyList.get(station2).add(station1);
        }
    }

    public List<Integer> getConnections(int station) {
        return adjacencyList.getOrDefault(station, new ArrayList<>());
    }

}
