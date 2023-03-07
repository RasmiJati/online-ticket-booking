/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.User;

/**
 *
 * @author rasmi
 */
public class UserController {
    
    public static void main(String[] args) {
        User u = new User(1L,"rasmi","rasmi@gmail.com","9841526341","rasmi");
        u.show();
        u.setId(2L);
        u.setName("jati");
        u.setEmail("rasas@gmail.dds");
        u.setPhone("9855454");
        u.setPassword("dhsgd");
        u.show();
    }
}
