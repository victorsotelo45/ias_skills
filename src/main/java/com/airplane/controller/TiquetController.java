package com.airplane.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.airplane.demo.Tiquet;
import com.airplane.demo.TiquetService;
import java.util.List;


@RestController
@RequestMapping("/airplane")
public class TiquetController {
    @Autowired
    private TiquetService tiquetService;

    @GetMapping("/tiquet")
    public List<Tiquet> getAllTiquet() {
        return tiquetService.getAllTiquet();
    }

    @GetMapping("/tiquet/{id}")
    public Tiquet getTiquet(@PathVariable Long id) {
        return tiquetService.getTiquetById(id);
    }

    @PostMapping("/tiquet")
    public void addTiquet(@RequestBody Tiquet tiquet) {
        tiquetService.addTiquet(tiquet);
    }

    @PutMapping("/tiquet/{id}")
    public void updateTiquet(@RequestBody Tiquet tiquet, @PathVariable Long id) {
        tiquetService.updateTiquet(id, tiquet);
    }

    @DeleteMapping("/tiquet/{id}")
    public void deleteTiquet(@PathVariable Long id) {
        tiquetService.deleteTiquet(id);
    }

}