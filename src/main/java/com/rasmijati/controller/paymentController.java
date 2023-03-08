/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.Payment;
import com.rasmijati.repository.paymentRepository;
import java.util.Date;

/**
 *
 * @author rasmi
 */
public class paymentController {
    
    private static paymentRepository paymentRepository;
    
    public static void main(String[] args) {
        Date date = new Date();
        Payment p = new Payment(1L, 1L, date, 4000.00);
        paymentRepository = new paymentRepository();
        paymentRepository.create(p);
        System.out.println(paymentRepository.show());
        System.out.println(paymentRepository.findById(2L));
    }
}
