package com.rodeoelectric.database.dao;
import com.rodeoelectric.database.entity.WorkOrders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkOrdersDAO extends JpaRepository<WorkOrders, Integer> {
    WorkOrders findByEmail(String email);

    @Query("SELECT w FROM WorkOrders w WHERE w.name LIKE %:name%")
    List<WorkOrders> findByNameContaining(@Param("name") String name);
}
