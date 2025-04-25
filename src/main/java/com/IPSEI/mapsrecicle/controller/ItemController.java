package com.IPSEI.mapsrecicle.controller;

import com.IPSEI.mapsrecicle.model.item;
import com.IPSEI.mapsrecicle.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v0/items")
public class ItemController {

    @Autowired
    private ItemService pitemService;

    @GetMapping
    public ResponseEntity<List<item>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(pitemService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<item>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(pitemService.findById(id));
    }

    @PostMapping
    public ResponseEntity<item> create(@RequestBody item pitem){
        return ResponseEntity.status(HttpStatus.CREATED).body(pitemService.save(pitem));
    }

    @PutMapping
    public ResponseEntity<item> update(@RequestBody item pitem){
        return ResponseEntity.status(HttpStatus.OK).body(pitemService.update(pitem));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        pitemService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}