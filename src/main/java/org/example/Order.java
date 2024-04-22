package org.example;

public class Order {
    private long orderId;
    private String customerName;
    private double amount;
    public Order(long orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }



    // Getters et setters
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}