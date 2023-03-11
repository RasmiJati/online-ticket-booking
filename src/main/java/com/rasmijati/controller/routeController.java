/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.Route;
import com.rasmijati.repository.routeRepository;

/**
 *
 * @author rasmi
 */
public class routeController {

    private static routeRepository routeRepository;

    public static void main(String[] args) {
        Route r = new Route(1L, "ktm", "bkt", 100L);
        Route r1 = new Route(2L, "ktm", "bkt", 100L);
        Route r2 = new Route(3L, "ktm", "bkt", 100L);

        routeRepository = new routeRepository();
        routeRepository.create(r);
        routeRepository.create(r1);
        routeRepository.create(r2);

        System.out.println("Dispaly all route : ");
        System.out.println(routeRepository.show());
        
        System.out.println("Display route by id:");
        System.out.println(routeRepository.findById(2L));
        
        routeRepository.delete(r);
        System.out.println("show all after delete : " + routeRepository.show());

    }
}
