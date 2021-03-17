package tech.itpark.avito.controller;

import org.springframework.web.bind.annotation.*;
import tech.itpark.avito.domain.Flat;
import tech.itpark.avito.domain.FlatCreate;
import tech.itpark.avito.domain.FlatUpdate;
import tech.itpark.avito.manager.FlatManager;

import java.util.ArrayList;

@RestController

public class FlatController {
    FlatManager manager = new FlatManager();

    @GetMapping("/flats")
        public ArrayList<Flat> getAll() {
        return manager.getAll();
    }

    @GetMapping("/flats/{id}")
        public Flat getById (@PathVariable long id) {
            return manager.getById(id);
    }

    @PostMapping("/flats")
    public Flat create (@RequestBody FlatCreate dto) {
        return manager.create(dto);
    }

    @PutMapping("/flats/{id}")
    public Flat updateById (@PathVariable long id, @RequestBody FlatUpdate dto) {
        return manager.updateById(id,dto);
    }

    @GetMapping("/flats/search")
    public ArrayList<Flat> searchBy (@RequestParam int minPrice, @RequestParam int maxPrice) {
        return manager.searchBy(maxPrice, minPrice);
    }

    @DeleteMapping("/flats/{id}")
    public void removedById (@PathVariable long id) {
        manager.removedById(id);
    }
}
