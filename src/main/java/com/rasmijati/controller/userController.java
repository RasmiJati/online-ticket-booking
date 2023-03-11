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

        User u = new User(1L, "rasmi", "rasmi@", "1111111111", "1111");
        User u1 = new User(2L, "asmi", "asmi@", "2222222222", "2222");
        User u2 = new User(3L, "smit", "smit@", "3333333333", "3333");
        User u3 = new User(4L, "rasmita", "rasmita@", "444444444", "4444");

        System.out.println("Creating Users");
        userRepository.create(u);
        userRepository.create(u1);
        userRepository.create(u2);
        userRepository.create(u3);

        System.out.println("Find All Users : ");
        System.out.println(userRepository.show());

        System.out.println("Find Users by id: ");
        System.out.println(userRepository.findUserById(2L));

        userRepository.delete(u);
        System.out.println("Show Users after deleting : ");
        System.out.println(userRepository.show());

        userRepository.edit(u1);
        System.out.println("After edit" + userRepository.show());

    }
}
