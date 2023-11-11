package ru.gozhan.mosmetronavigation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class MetroStation {
    private String line;
    private String name;
}
