package com.IPSEI.mapsrecicle.service;
import com.IPSEI.mapsrecicle.model.AdminPoint;
import java.util.List;
import java.util.Optional;


public interface AdminPointService {
    AdminPoint save(AdminPoint adminPoint);

    List<AdminPoint> findAll();

    Optional<AdminPoint> findById(Long id);

    AdminPoint update(AdminPoint adminPoint);

    void deleteById(Long id);
}