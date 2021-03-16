package tech.itpark.avito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class FlatUpdate {
    private int price;
    private String image;
    private String description;
}
