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
        Optional<Invester> investerOptional = investerRepository.findById(id);
        return investerOptional.orElse(null);
    }

    @Override
    public List<Invester> getAllInvesters() {
      return   investerRepository.findAll();
    }

    @Override
    public Invester createInvester(Invester invester) {
        return investerRepository.save(invester);
    }

    @Override
    public Invester updateInvester(Long id, Invester updateInvester) {
        return investerRepository.save(updateInvester);
    }

    @Override
    public void deleteInvester(Long id) {
        investerRepository.deleteById(id);

    }

    public Invester updateInvestor(Long id, Invester updatedInvester) {
        Optional<Invester> investerOptional = investerRepository.findById(id);
        if (investerOptional.isPresent()) {
            Invester existingInvester = investerOptional.get();
            // Update the fields of the existing investor with the values from updatedInvestor
            existingInvester.setFirstName(updatedInvester.getFirstName());
            existingInvester.setLastName(updatedInvester.getLastName());
            existingInvester.setAddress(updatedInvester.getAddress());
            existingInvester.setContact(updatedInvester.getContact());

            // Save the updated investor
            return investerRepository.save(existingInvester);
        } else {
            // Investor not found
            return null;
        }
    }
}
