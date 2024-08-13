package com.airplane.demo;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;


public class TiquetService {
    @Autowired
    private TiquetRepository tiquetRepository;

    public List<Tiquet> getAllTiquet() {
        List<Tiquet> tiquet = new ArrayList<>();
        tiquetRepository.findAll().forEach(tiquet::add);
        return tiquet;
    }

    public Tiquet getTiquetById(Long id) {
        return tiquetRepository.findById(id).get();
    }

    public void addTiquet(Tiquet tiquet) {
        tiquetRepository.save(tiquet);
    }

    public void updateTiquet(Long id, Tiquet tiquet) {
        tiquetRepository.save(tiquet);
    }

    public void deleteTiquet(Long id) {
        tiquetRepository.deleteById(id);
    }
}