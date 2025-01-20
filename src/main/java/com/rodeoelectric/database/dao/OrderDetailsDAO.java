package com.rodeoelectric.database.dao;

import com.rodeoelectric.database.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsDAO extends JpaRepository<OrderDetails, Integer> {

    List<OrderDetails> findByCustomerId(Integer customerId);

    @Query("SELECT o FROM OrderDetails o WHERE o.status = :status")
    List<OrderDetails> findByStatus(@Param("status") String status);
}
