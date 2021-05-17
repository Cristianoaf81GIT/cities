package com.github.cristianoaf81.cities.resources;

import com.github.cristianoaf81.cities.entities.City;
import com.github.cristianoaf81.cities.repositories.CityRespository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRespository respository;

    public CityResource(final CityRespository repository) {
        this.respository = repository;
    }


    @GetMapping
    public Page<City> cities(final Pageable page) {
        return respository.findAll( page );
    }

}