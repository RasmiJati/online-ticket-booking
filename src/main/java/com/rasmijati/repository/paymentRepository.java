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

    public Payment findById(Long id) {
        for (Payment p : payment_list) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void delete(Payment p){
        this.payment_list.remove(p);
    }
    
    public void edit(Payment p){
        payment_list.stream()
                .filter(x->x.getId()
                .equals(p.getId()))
                .forEach(x-> {
                    x.setBooking_id(p.getBooking_id());
                    x.setDate(p.getDate());
                    x.setAmount(p.getAmount());
                });
    }

}
