package com.enviro.assessment.grad001.angelmashego.investers.repository;

import com.enviro.assessment.grad001.angelmashego.investers.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByInvesterId(Long investerId);
}
