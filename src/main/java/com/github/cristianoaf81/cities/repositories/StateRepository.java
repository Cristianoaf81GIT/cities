package com.github.cristianoaf81.cities.repositories;

import com.github.cristianoaf81.cities.entities.State;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
    
}
