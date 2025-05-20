package com.firstproject.store.payment;

public class EsewaPaymentService implements PaymentService {
    public void paymentType (String name){
        System.out.println("Payment Type : " + name);
    }
    @Override
    public void payment (int amount){
        System.out.println("Payment System : e-sewa \n");
        System.out.println("Amount paid : " + amount);
    }
}
