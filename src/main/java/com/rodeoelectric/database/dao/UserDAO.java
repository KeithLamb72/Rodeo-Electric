package com.rodeoelectric.database.dao;

import com.rodeoelectric.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserDAO extends JpaRepository<User, Integer> {
    User findByEmailIgnoreCase(String email);
}
