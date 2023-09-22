package com.enviro.assessment.grad001.angelmashego.investers.controller;

import com.enviro.assessment.grad001.angelmashego.investers.exception.InvesterNotFoundException;
import com.enviro.assessment.grad001.angelmashego.investers.model.Invester;
import com.enviro.assessment.grad001.angelmashego.investers.repository.InvesterRepository;
import com.enviro.assessment.grad001.angelmashego.investers.service.InvesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/investers")
public class InvesterController {

    @Autowired
    private InvesterRepository investerRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Invester> getInvesterWithProducts(@PathVariable Long id) {

        Invester invester = investerRepository.findById(id)
                .orElseThrow(() -> new InvesterNotFoundException(id));

        return ResponseEntity.ok(invester);
    }
}


