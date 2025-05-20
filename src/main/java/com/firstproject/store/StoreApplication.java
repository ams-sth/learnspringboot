package com.firstproject.store;

import com.firstproject.store.payment.EsewaPaymentService;
import com.firstproject.store.payment.KhaltiPaymentService;
import com.firstproject.store.payment.OrderService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {
	public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);
	OrderService orderservice = new OrderService(new EsewaPaymentService());
		orderservice.placeOrder();

	var khalti = new KhaltiPaymentService();
	OrderService orderservice2 = new OrderService(khalti);
	orderservice2.placeOrder();
	}
}
