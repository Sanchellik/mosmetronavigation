package ru.gozhan.mosmetronavigation;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MoscowMetro moscowMetro = new MoscowMetro();

        System.out.println("Введите название начальной станции:");
        String startStationName = scanner.nextLine();
        System.out.println("Введите номер линии начальной станции:");
        String startLine = scanner.nextLine();

        System.out.println("Введите название конечной станции:");
        String finishStationName = scanner.nextLine();
        System.out.println("Введите номер линии конечной станции:");
        String finishLine = scanner.nextLine();

        Integer startStationId = moscowMetro.getStationIdByLineAndStationName(startLine, startStationName);
        Integer finishStationId = moscowMetro.getStationIdByLineAndStationName(finishLine, finishStationName);

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        List<Integer> pathFromStartToFinish = moscowMetro.findPath(startStationId, finishStationId, breadthFirstSearch);

        System.out.println(moscowMetro.createStationsPathStringWithTransfers(pathFromStartToFinish));
    }
}