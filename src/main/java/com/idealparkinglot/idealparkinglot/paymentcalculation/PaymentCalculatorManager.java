package com.idealparkinglot.idealparkinglot.paymentcalculation;

import com.idealparkinglot.idealparkinglot.payment.PaymentMethod;
import com.idealparkinglot.idealparkinglot.payment.PaymentStrategy;

public class PaymentCalculatorManager {
    public PaymentCalculatorManager(double price,PaymentStrategy paymentStrategy)
    {
        PaymentMethod paymentMethod=new PaymentMethod(paymentStrategy,price);
    }
}
