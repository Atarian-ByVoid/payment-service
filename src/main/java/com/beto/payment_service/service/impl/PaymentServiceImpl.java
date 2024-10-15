package com.beto.payment_service.service.impl;

import org.springframework.stereotype.Service;

import com.beto.payment_service.model.Payment;
import com.beto.payment_service.service.PaymentService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}", payment);
        
    }
    
}
