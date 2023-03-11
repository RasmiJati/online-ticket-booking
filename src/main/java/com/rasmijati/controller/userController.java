/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.User;
import com.rasmijati.repository.userRepository;
import java.util.Scanner;

/**
 *
 * @author rasmi
 */
public class userController {

    private static userRepository userRepository;

    public static void main(String[] args) {
        userRepository = new userRepository();
        create();   // create method user controller
    }

    public static void create() {   // static methods beacuse the method can be called using the class name in other class
        Long id = null;
        String name = null;
        String email = null;
        String phone = null;
        String password = null;
        Scanner sc = new Scanner(System.in);
        while(id == null){
            System.out.println("Enter User id : ");
            String uid = sc.next();
            try{
                id = Long.valueOf(uid);
            }catch(NumberFormatException e){
                System.err.println("Error");
                id = null;
            }
        }
        
        while(name == null || name.isEmpty()){
            System.out.println("Enter user name : ");
            name = sc.next();
            break;
        }
        
        while(email == null || email.isEmpty()){
            System.out.println("Enter user email : ");
            email = sc.next();
            break;
        }
        
        while(phone == null || phone.isEmpty()){
            System.out.println("Enter phone : ");
            phone = sc.next();
            break;
        }
        
        while(password == null || password.isEmpty()){
            System.out.println("Enter password : ");
            password = sc.next();
            break;
        }
        
        User u = new User(id,name,email,phone,password);
        userRepository.create(u);  // create method of userRepository
        System.out.println(userRepository.show());
    }
}
