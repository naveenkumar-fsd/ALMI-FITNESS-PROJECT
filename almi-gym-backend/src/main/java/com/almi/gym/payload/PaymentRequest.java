package com.almi.gym.payload;

public class PaymentRequest {

    private String userEmail;
    private String plan;
    private double amount;

    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

    public String getPlan() { return plan; }
    public void setPlan(String plan) { this.plan = plan; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}