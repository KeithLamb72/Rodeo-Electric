package com.rodeoelectric.myapp.database.dao;

import com.rodeoelectric.myapp.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
