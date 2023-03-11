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
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println(".................................................................");
            System.out.println("Choose an operation from below : ");
            System.out.println("..................................................................");
            System.out.println("Enter 1 to create");
            System.out.println("Enter 2 to list ");
            System.out.println("Enter 3 to delete");
            System.out.println("Enter 4 to edit");
            System.out.println("Enter 5 to Exit");
            choice = sc.next();
            switch (choice) {
                case "1":
                    create();
                    System.out.println("..................................................................");
                    break;
                case "2":
                    list();
                    System.out.println("..................................................................");
                    break;
                case "3":
                    delete();
                    System.out.println("..................................................................");
                    break;
                case "4":
                    edit();
                    System.out.println("..................................................................");
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!choice.equals("0"));
    }

    public static void create() {   // static methods beacuse the method can be called using the class name in other class
        Long id = null;
        String name = null;
        String email = null;
        String phone = null;
        String password = null;
        Scanner sc = new Scanner(System.in);
        while (id == null) {
            System.out.println("Enter User id : ");
            String uid = sc.next();
            try {
                id = Long.parseLong(uid);
            } catch (NumberFormatException e) {
                System.err.println("Error");
                id = null;
            }
        }

        while (name == null || name.isEmpty()) {
            System.out.println("Enter user name : ");
            name = sc.next();
            break;
        }

        while (email == null || email.isEmpty()) {
            System.out.println("Enter user email : ");
            email = sc.next();
            break;
        }

        while (phone == null || phone.isEmpty()) {
            System.out.println("Enter phone : ");
            phone = sc.next();
            break;
        }

        while (password == null || password.isEmpty()) {
            System.out.println("Enter password : ");
            password = sc.next();
            break;
        }

        User u = new User(id, name, email, phone, password);
        userRepository.create(u);  // create method of userRepository
        System.out.println("...........User Created Successfully..............");
    }

    public static void list() {
        System.out.println("............All Users List..................");
        userRepository.show()
                .stream()
                .forEach(x -> System.out.println(x)); //1st load the user list in stream and fetch one value at a time using for each
    }

    public static void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User's Id: ");
        Long id = sc.nextLong();
        User user = userRepository.findUserById(id);
        if (user == null) {
            System.out.println("..................User's ID " + id + " not found.............");
        } else {
            userRepository.delete(user);
            System.out.println("............User of id " + id + " deleted succesfully!!...........");
        }
    }

    public static void edit() {
        Long id = null;
        String name = null;
        String email = null;
        String phone = null;
        String password = null;
        Scanner sc = new Scanner(System.in);
        System.out.println(".........Edit Operation........");
        System.out.println("Enter User id : ");
        String uid = sc.next();
        try {
            id = Long.parseLong(uid);
        } catch (NumberFormatException e) {
            System.err.println("Error");
            id = null;
        }
        User user = userRepository.findUserById(id);
        if (user == null) {
            System.out.println("User with id " + id + " not found");

        } else {

            while (name == null || name.isEmpty()) {
                System.out.println("Enter user name : ");
                name = sc.next();
                break;
            }

            while (email == null || email.isEmpty()) {
                System.out.println("Enter user email : ");
                email = sc.next();
                break;
            }

            while (phone == null || phone.isEmpty()) {
                System.out.println("Enter phone : ");
                phone = sc.next();
                break;
            }

            while (password == null || password.isEmpty()) {
                System.out.println("Enter password : ");
                password = sc.next();
                break;
            }

            User u = new User(id, name, email, phone, password);
            userRepository.edit(u);
            System.out.println(".............User Edited Successfully...............");
        }
    }
}
