package com.enviro.assessment.grad001.angelmashego.investers.controller;

import com.enviro.assessment.grad001.angelmashego.investers.exception.EntityNotFoundException;
import com.enviro.assessment.grad001.angelmashego.investers.exception.ValidationException;
import com.enviro.assessment.grad001.angelmashego.investers.model.Product;
import com.enviro.assessment.grad001.angelmashego.investers.model.WithdrawalNotice;
import com.enviro.assessment.grad001.angelmashego.investers.service.ProductService;
import com.enviro.assessment.grad001.angelmashego.investers.service.WithdrawalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/withdrawal")
public class WithdrawalNoticeController {

    private final WithdrawalService withdrawalService;
    private final ProductService productService;


    @Autowired
    public WithdrawalNoticeController(WithdrawalService withdrawalService, ProductService productService) {
        this.withdrawalService = withdrawalService;
        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createWithdrawalNotice(
            @RequestParam Long productId,
            @RequestParam double withdrawalAmount,
            @RequestParam String productType,
            @RequestParam int investorAge) {
        try {

            if (withdrawalAmount <= 0) {
                return ResponseEntity.badRequest().body("Withdrawal amount must be greater than 0");
            }


            Product product = productService.getProductById(productId);
            if (withdrawalAmount > product.getCurrentBalance() * 0.9) {
                return ResponseEntity.badRequest().body("Withdrawal amount exceeds 90% of the current balance");
            }

            if ("RETIREMENT".equalsIgnoreCase(productType)) {
                if (investorAge <= 65) {
                    return ResponseEntity.badRequest().body("Investor age must be greater than 65 for RETIREMENT product");
                }
            }

            WithdrawalNotice withdrawalNotice = withdrawalService.createWithdrawalNotice(productId, withdrawalAmount);
            return ResponseEntity.ok(withdrawalNotice);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
