package com.firstproject.store.payment;

public class KhaltiPaymentService implements PaymentService{
    @Override
    public void payment(int amount) {
        System.out.println("Payment type: Khalti");
        System.out.println("Amount : " + amount);
    }
}
