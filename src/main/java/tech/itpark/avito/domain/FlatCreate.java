package tech.itpark.avito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class FlatCreate {
    private int rooms;
    private double metricArea;
    private int price;
    private String address;
}
