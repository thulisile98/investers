package com.enviro.assessment.grad001.angelmashego.investers.controller;

import com.enviro.assessment.grad001.angelmashego.investers.exception.InvesterNotFoundException;
import com.enviro.assessment.grad001.angelmashego.investers.model.Invester;
import com.enviro.assessment.grad001.angelmashego.investers.repository.InvesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvesterController {

    @Autowired
    private InvesterRepository investerRepository;

    @PostMapping("/INVESTER")
    Invester newInvester(@RequestBody Invester newInvester){
        return  investerRepository.save(newInvester);
    }

    @GetMapping("/INVESTERS")
    List<Invester> getAllInvesters(){
        return  investerRepository.findAll();
    }

    @GetMapping("/INVESTER/{id}")
    Invester getInvesterById(@PathVariable Long id){
        return  investerRepository.findById(id)
                .orElseThrow(()->new InvesterNotFoundException(id));
    }}


