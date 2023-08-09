package com.example.SpringProject2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringProject2.model.SpringProject2;
import com.example.SpringProject2.repository.SpringProject2Repository;

@RestController
@RequestMapping("/api")
public class SpringProject2Controller {
    @Autowired
    SpringProject2Repository mappingRepository;

    @GetMapping("/show_all/{id}")
    public Optional<SpringProject2> getAllValues(@PathVariable Long id) {
        return (Optional<SpringProject2>) mappingRepository.findById(id);
    }


     @DeleteMapping("/delete_all/{id}")
    public List<SpringProject2> deleteAllmapping(@PathVariable Long id) {
        mappingRepository.deleteById(id);
        return (List<SpringProject2>) mappingRepository.findAll();
    }




}
