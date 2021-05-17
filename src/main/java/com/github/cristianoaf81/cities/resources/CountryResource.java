package com.github.cristianoaf81.cities.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import com.github.cristianoaf81.cities.entities.Country;
import com.github.cristianoaf81.cities.repositories.CountryRepository;

@RestController 
@RequestMapping("/countries")
public class CountryResource {
    
    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page) {
       return repository.findAll( page );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        Optional<Country> optional = repository.findById(id);
        
        Country country = optional.orElse(null);
        
        if ( country == null ) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok().body(country);
    }
}
