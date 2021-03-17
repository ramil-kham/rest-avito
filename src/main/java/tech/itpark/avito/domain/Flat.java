package tech.itpark.avito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Flat {
    private long id;
    private int rooms;
    private double metricArea;
    private int price;
    private String address;
    private String image;
    private String description;
    private long created;
    private boolean removed;
}
