package com.IPSEI.mapsrecicle.controller;
import com.IPSEI.mapsrecicle.model.Point;
import com.IPSEI.mapsrecicle.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("api/v0/points")

public class PointController {
    @Autowired
    private PointService pointService;
    @GetMapping
    public ResponseEntity<List<Point>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(pointService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Point>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(pointService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Point> create(@RequestBody Point point){
        return ResponseEntity.status(HttpStatus.CREATED).body(pointService.save(point));
    }
    @PutMapping
    public ResponseEntity<Point> update(@RequestBody Point point){
        return ResponseEntity.status(HttpStatus.OK).body(pointService.update(point));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        pointService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
