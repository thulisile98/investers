package com.enviro.assessment.grad001.angelmashego.investers.controller;

import com.enviro.assessment.grad001.angelmashego.investers.model.Invester;
import com.enviro.assessment.grad001.angelmashego.investers.repository.InvesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvesterController {

    @Autowired
    private InvesterRepository investerRepository;

    @PostMapping("/INVESTER")
    Invester newInvester(@RequestBody Invester newInvester){
        return  investerRepository.save(newInvester);
    }

}
