package com.spring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.User;

public interface UserRepository extends JpaRepository<User, Serializable> {

}
