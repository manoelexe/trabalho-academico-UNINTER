package com.IPSEI.mapsrecicle.controller;
import com.IPSEI.mapsrecicle.model.AdminPoint;
import com.IPSEI.mapsrecicle.service.AdminPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("api/v0/adminpoints")
public class AdminPointController {
    @Autowired
    private AdminPointService adminPointService;
    @GetMapping
    public ResponseEntity<List<AdminPoint>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(adminPointService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<AdminPoint>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(adminPointService.findById(id));
    }
    @PostMapping
    public ResponseEntity<AdminPoint> create(@RequestBody AdminPoint adminpoint){
        return ResponseEntity.status(HttpStatus.CREATED).body(adminPointService.save(adminpoint));
    }
    @PutMapping
    public ResponseEntity<AdminPoint> update(@RequestBody AdminPoint adminpoint){
        return ResponseEntity.status(HttpStatus.OK).body(adminPointService.update(adminpoint));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        adminPointService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }  
}
