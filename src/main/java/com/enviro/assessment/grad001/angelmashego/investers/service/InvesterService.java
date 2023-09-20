package com.enviro.assessment.grad001.angelmashego.investers.service;

import com.enviro.assessment.grad001.angelmashego.investers.model.Invester;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InvesterService {

    Invester getInvesterById(Long id);
    List<Invester> getAllInvesters();
    Invester createInvester(Invester invester);
    Invester updateInvester(Long id, Invester updateInvester);

    void  deleteInvester(Long id);


}
