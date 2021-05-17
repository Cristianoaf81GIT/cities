package com.github.cristianoaf81.cities.resources;

import java.util.List;

import com.github.cristianoaf81.cities.entities.State;
import com.github.cristianoaf81.cities.repositories.StateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

    @Autowired
    private StateRepository repository;     
    

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }
}
