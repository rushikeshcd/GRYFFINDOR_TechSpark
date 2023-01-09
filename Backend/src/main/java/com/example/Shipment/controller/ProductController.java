package com.example.Shipment.controller;

import com.example.Shipment.model.Agent;
import com.example.Shipment.model.Product;
import com.example.Shipment.repository.AgentRepository;
import com.example.Shipment.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/agent")
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    @PostMapping("/agent")
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
