package com.enviro.assessment.grad001.angelmashego.investers.repository;

import com.enviro.assessment.grad001.angelmashego.investers.model.Invester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InvesterRepository extends JpaRepository<Invester,Long> {
    @Query("SELECT i FROM Invester i LEFT JOIN FETCH i.products")
    List<Invester> findAllInvestersWithProducts();

}
