/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.User;
import com.rasmijati.repository.UserRepository;

/**
 *
 * @author rasmi
 */
public class UserController {

    private static UserRepository userRepository;

    public static void main(String[] args) {
        userRepository = new UserRepository();
        User u = new User(1L, "rasmi", "rasmiasga", "684646546", "rasahgsa");
        User u1 = new User(1L, "rasmi", "rasmiasga", "684646546", "rasahgsa");

        userRepository.create(u);
        userRepository.create(u1);

        System.out.println(userRepository.show());
    }
}
