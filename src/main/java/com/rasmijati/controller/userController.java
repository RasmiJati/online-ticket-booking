/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.User;
import com.rasmijati.repository.userRepository;

/**
 *
 * @author rasmi
 */
public class userController {

    private static userRepository userRepository;

    public static void main(String[] args) {
        userRepository = new userRepository();
        User u = new User(1L, "rasmi", "rasmiasga", "684646546", "rasahgsa");
        User u1 = new User(1L, "rasmi", "rasmiasga", "684646546", "rasahgsa");

        userRepository.create(u);
        userRepository.create(u1);

        System.out.println(userRepository.show());
    }
}
