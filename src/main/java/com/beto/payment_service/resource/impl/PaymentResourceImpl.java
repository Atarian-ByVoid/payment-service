package com.beto.payment_service.resource.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beto.payment_service.model.Payment;
import com.beto.payment_service.resource.PaymentResource;
import com.beto.payment_service.service.PaymentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/payents")
@RequiredArgsConstructor
public class PaymentResourceImpl implements PaymentResource {

    private final PaymentService paymentService;
    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        paymentService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
}
