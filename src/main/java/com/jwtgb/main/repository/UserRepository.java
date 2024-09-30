package com.jwtgb.main.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jwtgb.main.model.User;

public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findByUsername(String username);
}
