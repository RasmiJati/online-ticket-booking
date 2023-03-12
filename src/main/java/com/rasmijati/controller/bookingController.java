/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.Booking;
import com.rasmijati.repository.bookingRepository;
import java.util.Scanner;

/**
 *
 * @author rasmi
 */
public class bookingController {

    private static bookingRepository bookingRepository;

    public static void main(String[] args) {
        bookingRepository = new bookingRepository();
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
        Long user_id = null;
        Long bus_id = null;
        Long route_id = null;
        String date = null;
        Long seats = null;
        Double fare = null;

        Scanner sc = new Scanner(System.in);

        while (id == null) {
            System.out.println("Enter Booking id : ");
            String bid = sc.next();
            try {
                id = Long.parseLong(bid);
            } catch (Exception e) {
                System.err.println("Error");
            }
        }

        while (user_id == null) {
            System.out.println("Enter user id : ");
            String uid = sc.next();
            try {
                user_id = Long.parseLong(uid);
            } catch (Exception e) {
                System.err.println("Error");
            }
        }

        while (bus_id == null) {
            System.out.println("Enter bus id : ");
            String bid = sc.next();
            try {
                bus_id = Long.parseLong(bid);
            } catch (Exception e) {
                System.err.println("Error");
            }
        }

        while (route_id == null) {
            System.out.println("Enter route id : ");
            String rid = sc.next();
            try {
                route_id = Long.parseLong(rid);
            } catch (Exception e) {
                System.err.println("Error");
            }
        }

        while (date == null || date.isEmpty()) {
            System.out.println("Enter date : ");
            date = sc.next();
            break;
        }

        while (seats == null) {
            System.out.println("Enter seats : ");
            seats = sc.nextLong();
            break;
        }

        while (fare == null) {
            System.out.println("Enter fare :");
            fare = sc.nextDouble();
            break;
        }

        Booking book = new Booking(id, user_id, bus_id, route_id, date, seats, fare);
        bookingRepository.create(book);
        System.out.println("Booking created successfully");
    }

    public static void list() {
        System.out.println("...........Booking List...........");
        bookingRepository.show()
                .stream()
                .forEach(x -> System.out.println(x));
    }

    public static void delete() {
        Long id = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to delete boking: ");
        id = sc.nextLong();
        Booking b = bookingRepository.findById(id);
        if (b == null) {
            System.out.println("Booking of Id" + id + " not found ");
        } else {
            bookingRepository.delete(b);
            System.out.println("Booking deleted successfully");
        }
    }

    public static void edit() {
        Long id = null;
        Long user_id = null;
        Long bus_id = null;
        Long route_id = null;
        String date = null;
        Long seats = null;
        Double fare = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to edit booking: ");
        id = sc.nextLong();
        Booking b = bookingRepository.findById(id);
        if (b == null) {
            System.out.println("Booking of Id" + id + " not found ");
        } else {
            while (user_id == null) {
                System.out.println("Enter user id : ");
                String uid = sc.next();
                try {
                    user_id = Long.parseLong(uid);
                } catch (Exception e) {
                    System.err.println("Error");
                }
            }

            while (bus_id == null) {
                System.out.println("Enter bus id : ");
                String bid = sc.next();
                try {
                    bus_id = Long.parseLong(bid);
                } catch (Exception e) {
                    System.err.println("Error");
                }
            }

            while (route_id == null) {
                System.out.println("Enter route id : ");
                String rid = sc.next();
                try {
                    route_id = Long.parseLong(rid);
                } catch (Exception e) {
                    System.err.println("Error");
                }
            }

            while (date == null || date.isEmpty()) {
                System.out.println("Enter date : ");
                date = sc.next();
                break;
            }

            while (seats == null) {
                System.out.println("Enter seats : ");
                seats = sc.nextLong();
                break;
            }

            while (fare == null) {
                System.out.println("Enter fare :");
                fare = sc.nextDouble();
                break;
            }

            Booking book = new Booking(id, user_id, bus_id, route_id, date, seats, fare);
            bookingRepository.edit(book);
            System.out.println("Booking edited successfully");
        }
    }
}
