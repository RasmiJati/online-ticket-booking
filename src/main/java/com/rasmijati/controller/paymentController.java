/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.Booking;
import com.rasmijati.model.Payment;
import com.rasmijati.repository.bookingRepository;
import com.rasmijati.repository.paymentRepository;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rasmi
 */
public class paymentController {

    private static paymentRepository paymentRepository;
    private static bookingRepository bookingRepository;

    public void crudOption(paymentRepository paymentRepository, bookingRepository bookingRepository) {
        this.paymentRepository = paymentRepository;
        this.bookingRepository = bookingRepository;
        Scanner sc = new Scanner(System.in);

        String choice;

        do {
            System.out.println(".................................");
            System.out.println("Choose the operation from below:");
            System.out.println(".................................");
            System.out.println("Enter 1 to create");
            System.out.println("Enter 2 to list");
            System.out.println("Enter 3 to delete");
            System.out.println("Enter 4 to edit");
            System.out.println("Enter 5 to exit");
            choice = sc.next();
            switch (choice) {
                case "1":
                    create();
                    System.out.println("..........................");
                    break;
                case "2":
                    list();
                    System.out.println("...........................");
                    break;
                case "3":
                    delete();
                    System.out.println("............................");
                    break;
                case "4":
                    edit();
                    System.out.println(".............................");
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        } while (!choice.equals("0"));

    }

    public static void create() {
        Long id = null;
        Booking booking = null;
        String date = null;
        Double amount = null;
        Scanner sc = new Scanner(System.in);

        while (id == null) {
            System.out.println("Enter Payment id : ");
            String bid = sc.next();
            try {
                id = Long.parseLong(bid);
            } catch (Exception e) {
                System.err.println("Error");
            }
        }

        List<Booking> bookings = bookingRepository.show();
        while (booking == null) {
            System.out.println("--------User Info----------- : ");
            System.out.println(bookings);
            Long booking_id = null;
            while (booking_id == null) {
                System.out.println("Enter user id : ");
                booking_id = sc.nextLong();
            }
            booking = bookingRepository.findById(booking_id);
        }

        while (date == null || date.isEmpty()) {
            System.out.println("Enter date : ");
            date = sc.next();
            break;
        }

        while (amount == null) {
            System.out.println("Enter amount : ");
            amount = sc.nextDouble();
            break;
        }
        Payment p = new Payment(id, booking, date, amount);
        p.setBooking(booking);
        paymentRepository.create(p);
        System.out.println("Payment Created successfully");
    }

    public static void list() {
        System.out.println("...........Payment List...........");
        paymentRepository.show()
                .stream()
                .forEach(x -> System.out.println(x));
    }

    public static void delete() {
        Long id = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to delete payment: ");
        id = sc.nextLong();
        Payment p = paymentRepository.findById(id);
        if (p == null) {
            System.out.println("Payment of Id" + id + " not found ");
        } else {
            paymentRepository.delete(p);
            System.out.println("Payment deleted successfully");
        }
    }

    public static void edit() {
        Long id = null;
        Booking booking = null;
        String date = null;
        Double amount = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to edit payment: ");
        id = sc.nextLong();
        Payment p = paymentRepository.findById(id);
        if (p == null) {
            System.out.println("Payment of Id" + id + " not found ");
        } else {
            List<Booking> bookings = bookingRepository.show();
            while (booking == null) {
                System.out.println("--------User Info----------- : ");
                System.out.println(bookings);
                Long booking_id = null;
                while (booking_id == null) {
                    System.out.println("Enter user id : ");
                    booking_id = sc.nextLong();
                }
                booking = bookingRepository.findById(booking_id);

            }

            while (date == null || date.isEmpty()) {
                System.out.println("Enter date : ");
                date = sc.next();
                break;
            }

            while (amount == null) {
                System.out.println("Enter amount : ");
                amount = sc.nextDouble();
                break;
            }
        }
        Payment pay = new Payment(id, booking, date, amount);
        pay.setBooking(booking);
        paymentRepository.edit(pay);
        System.out.println("Payment edited successfully");
    }
}
