package com.BoubkoukDuchatelet.Market.form;

import com.BoubkoukDuchatelet.Market.entity.Product;
import org.springframework.web.multipart.MultipartFile;

public class ProductForm {
    private String code;
    private String name;
    private double price;
    private double priceEvat;
    private int vat;

    private boolean newProduct = false;

    // Upload file.
    private MultipartFile fileData;

    public ProductForm() {
        this.newProduct= true;
    }

    public ProductForm(Product product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
        this.vat = product.getVat();
        this.priceEvat = this.getPrice() / ((this.getVat()/100)+1.00);
    }

    public String getCode() { return code; }

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

    public double getPriceEvat() {
        return priceEvat;
    }

    public void setPriceEvat(double priceEvat) {
        this.priceEvat = priceEvat;
    }

    public MultipartFile getFileData() {
        return fileData;
    }

    public void setFileData(MultipartFile fileData) {
        this.fileData = fileData;
    }

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }

    public int getVat() { return vat; }

    public void setVat(int vat) { this.vat = vat; }

}
