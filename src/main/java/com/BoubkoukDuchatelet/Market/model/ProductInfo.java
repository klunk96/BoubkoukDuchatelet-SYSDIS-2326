package com.BoubkoukDuchatelet.Market.model;

import com.BoubkoukDuchatelet.Market.entity.Product;

public class ProductInfo {
    private String code;
    private String name;
    private double price;
    private double evatPrice;
    private int vat;

    public ProductInfo() {
    }

    public ProductInfo(Product product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
        this.vat = product.getVat();
        this.evatPrice = this.getPrice() / ((this.getVat()/100)+1.00);
    }

    // Using in JPA/Hibernate query
    public ProductInfo(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.evatPrice = this.getPrice() / ((21/100)+1.00);
    }

    public ProductInfo(String code, String name, double price, int vat) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.vat = vat;
        this.evatPrice = this.getPrice() / ((this.getVat()/100)+1.00);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVat() { return vat; }

    public void setVat(int vat) { this.vat = vat; }

    public double getEvatPrice() {
        return evatPrice;
    }

    public void setEvatPrice(double evatPrice) {
        this.evatPrice = evatPrice;
    }
}
