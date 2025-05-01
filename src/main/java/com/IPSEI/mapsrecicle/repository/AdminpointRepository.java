package com.IPSEI.mapsrecicle.repository;
import com.IPSEI.mapsrecicle.model.AdminPoint;
import org.springframework.data.jpa.repository.JpaRepository;   


public interface AdminpointRepository extends JpaRepository<AdminPoint, Long> {
    // Custom query methods can be defined here if needed
}