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
        Bus b1 = new Bus(2L, "8080", "mini", 20L);
        Bus b2 = new Bus(3L, "6060", "super", 25L);
        Bus b3 = new Bus(4L, "5152", "mini", 20L);

        busRepository = new busRepository();

        System.out.println("Create bus:");
        busRepository.create(b);
        busRepository.create(b1);
        busRepository.create(b2);
        busRepository.create(b3);
        System.out.println("Show all buses: ");
        System.out.println(busRepository.show());

        System.out.println("Find bus by id:");
        System.out.println(busRepository.findBusByTd(1L));

        busRepository.delete(b1);
        System.out.println("Show all after delete:");
        System.out.println(busRepository.show());
    }

}
