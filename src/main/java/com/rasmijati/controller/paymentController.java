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
        Payment p1 = new Payment(2L, 1L, date, 4000.00);
        Payment p2 = new Payment(3L, 1L, date, 4000.00);

        paymentRepository = new paymentRepository();

        paymentRepository.create(p);
        paymentRepository.create(p1);
        paymentRepository.create(p2);

        System.out.println("Show all payment: ");
        System.out.println(paymentRepository.show());

        System.out.println("show payment by id:");
        System.out.println(paymentRepository.findById(2L));
        
        paymentRepository.delete(p);
        System.out.println("show after delete:");
        System.out.println(paymentRepository.show());
    }
}
