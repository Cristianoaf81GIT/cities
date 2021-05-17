package com.github.cristianoaf81.cities.repositories;

import com.github.cristianoaf81.cities.entities.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long>{
    
}
