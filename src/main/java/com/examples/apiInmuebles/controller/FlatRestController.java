package com.examples.apiInmuebles.controller;

import com.examples.apiInmuebles.entity.Flat;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class FlatRestController {
    
    List<Flat> flatList;
   
    @PostConstruct
    public void loadData() {
        flatList = new ArrayList<>();

        flatList.add(new Flat(10, 2, 20, 7642537, "Buena"));
        flatList.add(new Flat(12, 1, 25, 2654276, "Nuevo"));
        flatList.add(new Flat(2, 1, 30, 5237453, "A reformar"));
    }

    @GetMapping("/flats")
    public List<Flat> listFlats() {

        return flatList;
    }

    @GetMapping("/flats/{flatId}")
    public Flat getFlat(@PathVariable int flatId) {
        for (Flat flat : this.flatList) {
            if (flat.getCatastralCode() == flatId) {
                return flat;
            }
        }
        return null;
    }

    @PostMapping("/flats")
    public Flat addFlat(@RequestBody Flat theFlat) {
        flatList.add(theFlat);

        return theFlat;
    }

    @PutMapping("/flats")
    public Flat updateFlat(@RequestBody Flat theFlat) {
        for (Flat flat : flatList) {
            if (flat.getId() == theFlat.getId()) {
                flat.setFlatNum(theFlat.getFlatNum());
                flat.setFlatDoor(theFlat.getFlatDoor());
                flat.setArea(theFlat.getArea());
                flat.setCatastralCode(theFlat.getCatastralCode());
                flat.setCondition(theFlat.getCondition());
            }
        }
        return theFlat;
    }
    
    @DeleteMapping("/flats/{flatId}")
    public String deleteFlat(@PathVariable int flatId){
        this.flatList.removeIf(s -> s.getCatastralCode() == flatId);
        
        return "Borrado el piso: " + flatId;
    }
}
