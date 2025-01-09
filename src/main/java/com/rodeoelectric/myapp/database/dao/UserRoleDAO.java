package com.rodeoelectric.myapp.database.dao;

import com.rodeoelectric.myapp.database.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleDAO extends JpaRepository<UserRole, Integer> {
}
