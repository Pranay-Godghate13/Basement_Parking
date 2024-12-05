package com.idealparkinglot.idealparkinglot.payment;

public class Payment {
    PaymentStrategy paymentStrategy;
    double price;
    public Payment(PaymentStrategy paymentStrategy,double price)
    {
        this.paymentStrategy=paymentStrategy;
        this.price=price;
        choosePaymentMethod();
    }
    public void choosePaymentMethod()
    {
        paymentStrategy.paymentMethod(price);
    }
}
