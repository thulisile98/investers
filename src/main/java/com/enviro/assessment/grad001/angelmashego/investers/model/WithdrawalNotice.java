package com.enviro.assessment.grad001.angelmashego.investers.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class WithdrawalNotice {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "withdrawal_amount")
    private double withdrawalAmount;

    @Column(name = "withdrawal_date")
    private Date withdrawalDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    public WithdrawalNotice() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public Date getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Date withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }



}
