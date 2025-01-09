package com.rodeoelectric.myapp.database.dao;

import com.rodeoelectric.myapp.database.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceDAO extends JpaRepository<Service, Integer> {
    List<Service> findByServiceNameContaining(String keyword);
}
