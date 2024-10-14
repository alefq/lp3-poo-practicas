package com.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VendibleController {


    @GetMapping("/vendibles")
    public ResponseEntity<List<Vendible>> mostrarVendibles() {
        List<Vendible> vendibles = new ArrayList<>();

        SkinsPersonaje latino = new SkinsPersonaje(123);
        latino.setDescripcion("Messi");
        latino.setNombre("Leo");
        vendibles.add(latino);

        Subfusil subfusil = new Subfusil(1800, 5,"Subfusil básico de nivel 5", "MP7");
        vendibles.add(subfusil);

        Subfusil subfusil2 = new Subfusil(5000, 10, "Subfusil prestigio de nivel 10","MP5");
        vendibles.add(subfusil2);

        
        // Explicitly return 200 OK status code
        return new ResponseEntity<>(vendibles, HttpStatus.OK);
    }

}