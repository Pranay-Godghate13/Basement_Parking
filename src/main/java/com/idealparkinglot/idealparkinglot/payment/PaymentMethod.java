package com.idealparkinglot.idealparkinglot.payment;

public class PaymentMethod extends Payment {
    
    public PaymentMethod(PaymentStrategy paymentStrategy,double price)
    {
        super(paymentStrategy,price);
    }
}
