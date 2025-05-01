package com.IPSEI.mapsrecicle.service;
import com.IPSEI.mapsrecicle.model.Point;
import com.IPSEI.mapsrecicle.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class PointServiceImpl implements PointService{
    @Autowired
    private PointRepository pointRepository;
    @Override
    public Point save(Point point) {
        return pointRepository.save(point);
    }
    @Override
    public List<Point> findAll() {
        return pointRepository.findAll();
    }
    @Override
    public Optional<Point> findById(Long id) {
        return pointRepository.findById(id);
    }
    @Override
    public Point update(Point point) {
        return pointRepository.save(point);
    }
    @Override
    public void deleteById(Long id) {
        pointRepository.deleteById(id);
    }  
}