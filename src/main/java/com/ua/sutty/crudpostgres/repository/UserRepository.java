package com.ua.sutty.crudpostgres.repository;

import com.ua.sutty.crudpostgres.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(Long id);
    void deleteUserById(Long id);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsById(Long id);
}
