package com.enviro.assessment.grad001.angelmashego.investers.repository;

import com.enviro.assessment.grad001.angelmashego.investers.model.Product;
import com.enviro.assessment.grad001.angelmashego.investers.model.WithdrawalNotice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WithdrawalNoticeRepository extends JpaRepository<WithdrawalNotice,Long> {
    List<WithdrawalNotice> findByProduct(Product product);
}
