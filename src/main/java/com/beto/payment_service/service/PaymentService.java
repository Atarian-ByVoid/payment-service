package com.beto.payment_service.service;

import com.beto.payment_service.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
    
}
