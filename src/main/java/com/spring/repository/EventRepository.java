package com.spring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Event;

public interface EventRepository extends JpaRepository<Event, Serializable>{

}
