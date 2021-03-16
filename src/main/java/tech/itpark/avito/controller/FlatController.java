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

    @GetMapping("/users/{id}")
        public Flat getById(@PathVariable long id) {
            return manager.getById(id);
    }

    @PostMapping("/users")
    public Flat create(@RequestBody FlatCreate dto) {
        return manager.create(dto);
    }

    @PutMapping("/users/{id}")
    public Flat updateById(@PathVariable long id, @RequestBody FlatUpdate dto) {
        return manager.updateById(id,dto);
    }

    //@GetMapping("/users/search")
    //public ArrayList<Flat>

}
