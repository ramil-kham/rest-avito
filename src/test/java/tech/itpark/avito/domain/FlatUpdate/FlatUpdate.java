package tech.itpark.avito.domain.FlatUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class FlatUpdate {
    private long id;
    private int rooms;
    private double metricArea;
    private int floor;
    private int floorsInTheHouse;
    private int price;
    private String address;
    private String seller;
    private String image;
    private long created;
}

