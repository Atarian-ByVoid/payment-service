package com.beto.payment_service.model;
import java.io.Serializable;

import lombok.Getter;

/**
 * Payment
 */
@Getter
public class Payment implements Serializable {

    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;

    
}