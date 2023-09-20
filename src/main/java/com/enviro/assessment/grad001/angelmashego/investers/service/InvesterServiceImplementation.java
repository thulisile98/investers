package com.enviro.assessment.grad001.angelmashego.investers.service;

import com.enviro.assessment.grad001.angelmashego.investers.model.Invester;
import com.enviro.assessment.grad001.angelmashego.investers.repository.InvesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvesterServiceImplementation implements InvesterService{

    private final InvesterRepository investerRepository;

    @Autowired
    public InvesterServiceImplementation(InvesterRepository investerRepository) {
        this.investerRepository = investerRepository;
    }



    @Override
    public Invester getInvesterById(Long id) {
        Optional<Invester> investorOptional = investerRepository.findById(id);
        return investorOptional.orElse(null);
    }

    @Override
    public List<Invester> getAllInvesters() {
      return   investerRepository.findAll();
    }

    @Override
    public Invester createInvester(Invester invester) {
        return null;
    }

    @Override
    public Invester updateInvester(Long id, Invester updateInvester) {
        return investerRepository.save(updateInvester);
    }

    @Override
    public void deleteInvester(Long id) {
        investerRepository.deleteById(id);

    }
}
