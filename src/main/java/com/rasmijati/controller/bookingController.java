/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.rasmijati.controller;

import com.rasmijati.model.Booking;
import java.util.Date;

/**
 *
 * @author rasmi
 */
public class bookingController {
    public static void main(String[] args) {
        Date date = new Date();
        Booking b = new Booking(1L, 2L, 1L, 1L, date , 25L, 3500.00);
        b.show();
    }
}
