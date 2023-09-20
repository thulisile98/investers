package com.enviro.assessment.grad001.angelmashego.investers.controller;

import com.enviro.assessment.grad001.angelmashego.investers.model.Invester;
import com.enviro.assessment.grad001.angelmashego.investers.model.Product;
import com.enviro.assessment.grad001.angelmashego.investers.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
   private  ProductRepository productRepository;


    @PostMapping("/PRODUCT")
    Product newProduct(@RequestBody Product newProduct){
        return  productRepository.save(newProduct);
    }
}
