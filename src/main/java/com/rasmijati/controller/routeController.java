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
        Route r = new Route(1L,"ktm","bkt",100L);
        
        routeRepository = new routeRepository();
        routeRepository.create(r);
        System.out.println(routeRepository.show());
        System.out.print(routeRepository.findById(2L));
    }
}
