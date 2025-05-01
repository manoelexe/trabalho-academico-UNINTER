package com.IPSEI.mapsrecicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IPSEI.mapsrecicle.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}