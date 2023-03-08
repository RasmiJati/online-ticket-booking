/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.repository;

import com.rasmijati.model.Payment;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasmi
 */
public class paymentRepository {

    private List<Payment> payment_list;

    public paymentRepository() {
        payment_list = new ArrayList<>();
    }

    public void create(Payment p) {
        this.payment_list.add(p);
    }

    public List<Payment> show() {
        return payment_list;
    }
}
