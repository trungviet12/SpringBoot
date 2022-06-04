package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.model.ResponseOjbect;
import com.example.demo.repositorie.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/Product")
public class ProductController {
    @Autowired
    private ProductRepository repository;
    @GetMapping("")
    List<Product> getAllproducts(){
        return repository.findAll();
}
    @GetMapping("/{id}")
    ResponseEntity <ResponseOjbect> findById(@PathVariable Long id ){
        Optional<Product> foundProduct = repository.findById(id);
        if (foundProduct.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseOjbect("ok","Query product successfully",foundProduct)
            );

        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseOjbect("false", "Cannot find product with id ="+id,"")
            );
        }
    }
}
