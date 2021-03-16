package tech.itpark.avito.manager;

import tech.itpark.avito.domain.Flat;
import tech.itpark.avito.domain.FlatCreate;
import tech.itpark.avito.domain.FlatUpdate;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class FlatManager {
    private ArrayList<Flat> flats = new ArrayList<>();
    private long nextId = 1;

    public ArrayList<Flat> getAll() {
        return flats;
    }

    public Flat getById(long id) {
        for (Flat flat : flats) {
            if (flat.getId() == id) {
                return flat;
            }

        }
        return null;
    }

    public Flat create(FlatCreate dto) {
        Flat Kamaleeva = new Flat(
                nextId++,
                1,
                31.5,
                4,
                5,
                3_000_000,
                "пр-т Альберта Камалеева, д. 32Б",
                "https://68.img.avito.st/image/1/wfT-6baybR3IXu8Q8MaH2QZKbRteSG8",
                "Хорошая квартира",
                OffsetDateTime.now().toEpochSecond()
        );
        flats.add(Kamaleeva);
        return Kamaleeva;
    }

    public Flat updateById(long id, FlatUpdate dto) {
        for (Flat flat : flats) {
            if (flat.getId() == id) {
                flat.setPrice(dto.getPrice());
                flat.setImage(dto.getImage());
                flat.setDescription(dto.getDescription());

                return flat;
            }
        }
        return null;
    }


}