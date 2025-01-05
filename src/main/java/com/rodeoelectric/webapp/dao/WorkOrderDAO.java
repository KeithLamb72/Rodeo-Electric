package com.rodeoelectric.webapp.dao;

import com.rodeoelectric.webapp.entity.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkOrderDAO extends JpaRepository<WorkOrder, Integer> {

    List<WorkOrder> findByCustomerId(Integer customerId);

    @Query("SELECT w FROM WorkOrder w WHERE w.status = :status")
    List<WorkOrder> findByStatus(@Param("status") String status);
}
