package com.IPSEI.mapsrecicle.service;

import com.IPSEI.mapsrecicle.model.Point;
import java.util.List;
import java.util.Optional;



public interface PointService {
    Point save(Point point);

    List<Point> findAll();

    Optional<Point> findById(Long id);

    Point update(Point point);

    void deleteById(Long id);
}

