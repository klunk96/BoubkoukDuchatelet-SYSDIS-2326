package com.BoubkoukDuchatelet.Market.model;

import java.util.Date;
import java.util.List;

public class OrderInfo {

    private String id;
    private Date orderDate;
    private int orderNum;
    private double amount;
    private double et;
    private boolean delivery;

    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;

    private List<OrderDetailInfo> details;

    public OrderInfo() {

    }

    // Using for Hibernate Query.
    public OrderInfo(String id, Date orderDate, int orderNum, //
                     double amount,double et, boolean delivery, String customerName, String customerAddress, //
                     String customerEmail, String customerPhone) {
        this.id = id;
        this.orderDate = orderDate;
        this.orderNum = orderNum;
        this.amount = amount;
        this.et = et;
        this.delivery = delivery;

        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public List<OrderDetailInfo> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetailInfo> details) {
        this.details = details;
    }

    public void setEt(double et) {
        this.et = et;
    }

    public double getEt() {
        return et;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public boolean isDelivery() {
        return delivery;
    }
}
