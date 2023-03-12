/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.Booking;
import com.rasmijati.model.Bus;
import com.rasmijati.model.Route;
import com.rasmijati.model.User;
import com.rasmijati.repository.bookingRepository;
import com.rasmijati.repository.busRepository;
import com.rasmijati.repository.routeRepository;
import com.rasmijati.repository.userRepository;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rasmi
 */
public class bookingController {

    private static bookingRepository bookingRepository;
    private static userRepository userRepository;
    private static busRepository busRepository;
    private static routeRepository routeRepository;

    public void crudOption(bookingRepository bookingRepository, userRepository userRepository, busRepository busRepository, routeRepository routeRepository) {
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
        this.busRepository = busRepository;
        this.routeRepository = routeRepository;
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
                    break;
            }
            System.out.println();
        } while (!choice.equals("0"));
    }

    public static void create() {
        Long id = null;
        User user = null;
        Bus bus = null;
        Route route = null;
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

        List<User> users = userRepository.show();
        while (user == null) {
            System.out.println("--------User Info----------- : ");
            System.out.println(users);
            Long user_id = null;
            while (user_id == null) {
                System.out.println("Enter user id : ");
                user_id = sc.nextLong();
            }
            user = userRepository.findUserById(user_id);
        }

        List<Bus> buses = busRepository.show();
        while (bus == null) {
            System.out.println("--------Bus Info----------- : ");
            System.out.println(buses);
            Long bus_id = null;
            while (bus_id == null) {
                System.out.println("Enter bus id : ");
                bus_id = sc.nextLong();
            }
            bus = busRepository.findBusById(bus_id);
        }

        List<Route> routes = routeRepository.show();
        while (route == null) {
            System.out.println("--------Route Info----------- : ");
            System.out.println(routes);
            Long route_id = null;
            while (route_id == null) {
                System.out.println("Enter route id : ");
                route_id = sc.nextLong();
            }
            route = routeRepository.findById(route_id);
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

        Booking book = new Booking(id, user, bus, route, date, seats, fare);
        book.setUser(user);
        book.setBus(bus);
        book.setRoute(route);
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
        User user = null;
        Bus bus = null;
        Route route = null;
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
            List<User> users = userRepository.show();
            while (user == null) {
                System.out.println("--------User Info----------- : ");
                System.out.println(users);
                Long user_id = null;
                while (user_id == null) {
                    System.out.println("Enter user id : ");
                    user_id = sc.nextLong();
                }
                user = userRepository.findUserById(user_id);
            }

            List<Bus> buses = busRepository.show();
            while (bus == null) {
                System.out.println("--------Bus Info----------- : ");
                System.out.println(buses);
                Long bus_id = null;
                while (bus_id == null) {
                    System.out.println("Enter bus id : ");
                    bus_id = sc.nextLong();
                }
                bus = busRepository.findBusById(bus_id);
            }

            List<Route> routes = routeRepository.show();
            while (route == null) {
                System.out.println("--------Route Info----------- : ");
                System.out.println(routes);
                Long route_id = null;
                while (route_id == null) {
                    System.out.println("Enter route id : ");
                    route_id = sc.nextLong();
                }
                route = routeRepository.findById(route_id);
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

            Booking book = new Booking(id, user, bus, route, date, seats, fare);
            book.setUser(user);
            book.setBus(bus);
            book.setRoute(route);
            bookingRepository.edit(book);
            System.out.println("Booking edited successfully");
        }
    }
}
