package com.BoubkoukDuchatelet.Market.model;

public class OrderDetailInfo {
    private String id;

    private String productCode;
    private String productName;

    private int quanity;
    private double price;
    private double amount;
    private double et;

    public OrderDetailInfo() {

    }

    // Using for JPA/Hibernate Query.
    public OrderDetailInfo(String id, String productCode, //
                           String productName, int quanity, double price, double amount, double et) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.quanity = quanity;
        this.price = price;
        this.amount = amount;
        this.et = et;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getEt() {
        return et;
    }

    public void setEt(double et) {
        this.et = et;
    }
}
