/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.repository.bookingRepository;
import com.rasmijati.repository.busRepository;
import com.rasmijati.repository.paymentRepository;
import com.rasmijati.repository.routeRepository;
import com.rasmijati.repository.userRepository;
import java.util.Scanner;

/**
 *
 * @author rasmi
 */
public class mainController {

    public static void main(String[] args) {
        userController userController = new userController();
        busController busController = new busController();
        routeController routeController = new routeController();
        bookingController bookingController = new bookingController();
        paymentController paymentController = new paymentController();

        userRepository userRepository = new userRepository();
        busRepository busRepository = new busRepository();
        routeRepository routeRepository = new routeRepository();
        bookingRepository bookingRepository = new bookingRepository();
        paymentRepository paymentRepository = new paymentRepository();

        Scanner sc = new Scanner(System.in);

        String choice;

        do {
            System.out.println(".................................");
            System.out.println("Choose the operation from below:");
            System.out.println(".................................");
            System.out.println("Enter 1 for User");
            System.out.println("Enter 2 for Bus");
            System.out.println("Enter 3 for Route");
            System.out.println("Enter 4 for Booking");
            System.out.println("Enter 5 for Payment");
            System.out.println("Enter 6 to exit");
            choice = sc.next();
            switch (choice) {
                case "1":
                    userController.crudOption(userRepository);
                    System.out.println("..........................");
                    break;
                case "2":
                    busController.crudOption(busRepository);
                    System.out.println("...........................");
                    break;
                case "3":
                    routeController.crudOption(routeRepository);
                    System.out.println("............................");
                    break;
                case "4":
                    bookingController.crudOption(bookingRepository, userRepository, busRepository, routeRepository);
                    System.out.println(".............................");
                    break;
                case "5":
                    paymentController.crudOption(paymentRepository, bookingRepository);
                    System.out.println(".............................");
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        } while (!choice.equals("0"));
    }
}
