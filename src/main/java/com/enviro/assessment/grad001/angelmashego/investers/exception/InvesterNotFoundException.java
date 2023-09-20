package com.enviro.assessment.grad001.angelmashego.investers.exception;

public class InvesterNotFoundException extends RuntimeException {

    public InvesterNotFoundException (Long id){
        super("could not find invester with id :" +id);
    }
}
