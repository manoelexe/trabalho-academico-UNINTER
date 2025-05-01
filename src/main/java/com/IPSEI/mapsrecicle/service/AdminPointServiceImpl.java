package com.IPSEI.mapsrecicle.service;
import com.IPSEI.mapsrecicle.model.AdminPoint;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.IPSEI.mapsrecicle.repository.AdminpointRepository;
@Service
public class AdminPointServiceImpl implements AdminPointService{
    @Autowired
    private AdminpointRepository pointRepository;
    @Override
    public AdminPoint save(AdminPoint adminpoint) {
        return pointRepository.save(adminpoint);
    }
    @Override
    public List<AdminPoint> findAll() {
        return pointRepository.findAll();
    }
    @Override
    public Optional<AdminPoint> findById(Long id) {
        return pointRepository.findById(id);
    }
    @Override
    public AdminPoint update(AdminPoint adminpoint) {
        return pointRepository.save(adminpoint);
    }
    @Override
    public void deleteById(Long id) {
        pointRepository.deleteById(id);
    }  
}