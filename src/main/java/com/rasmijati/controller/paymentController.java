/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.rasmijati.controller;

import com.rasmijati.model.Payment;
import java.util.Date;

/**
 *
 * @author rasmi
 */
public class paymentController {
    public static void main(String[] args) {
        Date date = new Date();
        Payment p = new Payment(1L, 1L, date, 4000.00);
        p.show();
    }
}
