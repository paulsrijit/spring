package com.example.security.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.jwt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User getUserByUserName(String username);

}
