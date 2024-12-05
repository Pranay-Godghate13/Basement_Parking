package com.idealparkinglot.idealparkinglot.payment;

public class Crypto implements PaymentStrategy {

    @Override
    public void paymentMethod(double price) {
        System.out.println("Payment of rupees "+price+" is done by crypto currency");
    }
    
}
