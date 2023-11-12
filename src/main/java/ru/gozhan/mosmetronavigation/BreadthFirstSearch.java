package ru.gozhan.mosmetronavigation;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import static ru.gozhan.mosmetronavigation.MoscowMetro.GRAPH;

public class BreadthFirstSearch implements PathSearch {

    @Override
    public List<Integer> search(int startStationId, int finishStationId) {
        // Проверка на случай, если начальная и конечная станции совпадают
        if (startStationId == finishStationId) {
            return Collections.singletonList(startStationId);
        }

        // Инициализация очереди для BFS
        Queue<Integer> stationsToVisit = new ArrayDeque<>();
        // Словарь для хранения "родительских" станций (для восстановления пути)
        Map<Integer, Integer> stationParents = new HashMap<>();
        // Набор для отслеживания посещенных станций
        Set<Integer> visitedStations = new HashSet<>();

        // Добавляем начальную станцию в очередь и отмечаем ее как посещенную
        stationsToVisit.add(startStationId);
        visitedStations.add(startStationId);

        // Основной цикл BFS
        while (!stationsToVisit.isEmpty()) {
            // Извлекаем станцию из очереди
            int currentStation = stationsToVisit.remove();

            // Перебор всех соседних станций
            for (int adjacentStation : GRAPH.getConnections(currentStation)) {
                // Проверка, была ли уже посещена соседняя станция
                if (!visitedStations.contains(adjacentStation)) {
                    // Запоминаем предка текущей станции
                    stationParents.put(adjacentStation, currentStation);
                    // Отмечаем соседнюю станцию как посещенную
                    visitedStations.add(adjacentStation);
                    // Добавляем соседнюю станцию в очередь
                    stationsToVisit.add(adjacentStation);

                    // Проверка, достигли ли мы конечной станции
                    if (adjacentStation == finishStationId) {
                        // Возвращаем восстановленный путь, если достигли конечной станции
                        return buildPath(stationParents, finishStationId);
                    }
                }
            }
        }
        // Возвращаем пустой список, если путь не найден
        return Collections.emptyList();
    }

    private List<Integer> buildPath(Map<Integer, Integer> stationParents, int endStationId) {
        // Список для хранения пути
        List<Integer> path = new ArrayList<>();
        // Начинаем с конечной станции
        Integer currentStation = endStationId;

        // Восстанавливаем путь, двигаясь от конечной станции к начальной
        while (currentStation != null) {
            // Добавляем текущую станцию в путь
            path.add(currentStation);
            // Переходим к "родительской" станции
            currentStation = stationParents.get(currentStation);
        }

        // Переворачиваем путь, чтобы он шел от начальной станции к конечной
        Collections.reverse(path);
        return path;
    }

}
