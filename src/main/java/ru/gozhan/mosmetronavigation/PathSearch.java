package ru.gozhan.mosmetronavigation;

import java.util.List;

public interface PathSearch {
    List<Integer> search(int startId, int finishId);
}
