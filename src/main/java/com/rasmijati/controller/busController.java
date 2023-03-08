/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.Bus;
import com.rasmijati.repository.busRepository;

/**
 *
 * @author rasmi
 */
public class busController {

    private static busRepository busRepository;

    public static void main(String[] args) {
        Bus b = new Bus(1L, "2527", "super", 25L);
        Bus b1 = new Bus(2L, "2527", "super", 60L);
        busRepository = new busRepository();
        busRepository.create(b);
        busRepository.create(b1);
        System.out.println(busRepository.show());
    }

}
