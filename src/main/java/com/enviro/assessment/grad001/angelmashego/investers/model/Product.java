package com.enviro.assessment.grad001.angelmashego.investers.model;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Invester getInvester() {
        return invester;
    }

    public void setInvester(Invester invester) {
        this.invester = invester;
    }

    private String name;
    private String type;
    private double currentBalance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invester_id")
    private Invester invester;


    @OneToMany(mappedBy = "product")
    private List<WithdrawalNotice> withdrawalNotices;

    public List<WithdrawalNotice> getWithdrawalNotices() {
        return withdrawalNotices;
    }

    public void setWithdrawalNotices(List<WithdrawalNotice> withdrawalNotices) {
        this.withdrawalNotices = withdrawalNotices;
    }
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
