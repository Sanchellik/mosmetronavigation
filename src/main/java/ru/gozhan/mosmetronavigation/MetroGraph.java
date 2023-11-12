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
        if (!this.adjacencyList.getOrDefault(station1, new ArrayList<>()).contains(station2)) {
            adjacencyList.putIfAbsent(station1, new ArrayList<>());
            adjacencyList.putIfAbsent(station2, new ArrayList<>());

            adjacencyList.get(station1).add(station2);
            adjacencyList.get(station2).add(station1);
        }
    }

    public List<Integer> getConnections(int station) {
        return adjacencyList.getOrDefault(station, new ArrayList<>());
    }

}
