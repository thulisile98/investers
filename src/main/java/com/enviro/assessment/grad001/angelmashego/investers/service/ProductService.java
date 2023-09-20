package com.enviro.assessment.grad001.angelmashego.investers.service;

import com.enviro.assessment.grad001.angelmashego.investers.model.Invester;
import com.enviro.assessment.grad001.angelmashego.investers.model.Product;
import com.enviro.assessment.grad001.angelmashego.investers.model.WithdrawalNotice;

import java.util.Date;
import java.util.List;

public interface ProductService {
    List<Product>getProductsByInvesterId(Long investerId);
    Product createProduct(Product product);

    Product createWithdrawalNotice(Long productId, double withdrawalAmount);
    List<WithdrawalNotice> getWithdrawalNoticesByProductId(Long productId, Date startDate, Date endDate);
}
