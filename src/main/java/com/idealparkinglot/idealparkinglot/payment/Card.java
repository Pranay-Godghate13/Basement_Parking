package com.idealparkinglot.idealparkinglot.payment;

public class Card implements PaymentStrategy {

    @Override
    public void paymentMethod(double price) {
        System.out.println("Payment of rupees "+price+" is done by card");
    }
    
}
