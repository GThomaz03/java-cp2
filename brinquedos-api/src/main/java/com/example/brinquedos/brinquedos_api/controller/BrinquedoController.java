package com.example.brinquedos.brinquedos_api.controller;

import com.example.brinquedos.brinquedos_api.model.Brinquedo;
import com.example.brinquedos.brinquedos_api.servico.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @GetMapping
    public List<Brinquedo> getAllBrinquedos() {
        return brinquedoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Brinquedo>> getBrinquedoById(@PathVariable Long id) {
        Optional<Brinquedo> brinquedo = brinquedoService.findById(id);
        return new ResponseEntity<>(brinquedo, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Brinquedo> createBrinquedo(@RequestBody Brinquedo brinquedo) {
        Brinquedo novoBrinquedo = brinquedoService.save(brinquedo);
        return new ResponseEntity<>(novoBrinquedo, HttpStatus.CREATED);
    }
}