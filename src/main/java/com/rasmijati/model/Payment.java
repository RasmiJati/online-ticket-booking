/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.rasmijati.model;

import java.util.Date;

/**
 *
 * @author rasmi
 */
public class Payment {

    private Long id;
    private Long booking_id;
    private String date;
    private Double amount;

    public Payment(Long id, Long booking_id, String date, Double amount) {
        this.id = id;
        this.booking_id = booking_id;
        this.date = date;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Long booking_id) {
        this.booking_id = booking_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "id=" + id + ", booking_id=" + booking_id + ", date=" + date + ", amount=" + amount;
    }   
}
