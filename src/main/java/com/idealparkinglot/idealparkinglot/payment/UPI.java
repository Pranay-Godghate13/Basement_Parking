package com.idealparkinglot.idealparkinglot.payment;

public class UPI implements PaymentStrategy {

    @Override
    public void paymentMethod(double price) {
        System.out.println("Payment of rupees "+price+" is done by UPI transaction");
    }
    
}
