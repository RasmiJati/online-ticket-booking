/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.Route;
import com.rasmijati.repository.routeRepository;
import java.util.Scanner;

/**
 *
 * @author rasmi
 */
public class routeController {

    private static routeRepository routeRepository;

    public void crudOption(routeRepository routeRepository) {
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
            }
        } while (!choice.equals("0"));
    }

    public static void create() {
        Long id = null;
        String starting_point = null;
        String destination = null;
        String distance = null;

        Scanner sc = new Scanner(System.in);
        while (id == null) {
            System.out.println("Enter Route id : ");
            String rid = sc.next();
            try {
                id = Long.parseLong(rid);
            } catch (Exception e) {
                System.err.println("Error");
            }
        }

        while (starting_point == null || starting_point.isEmpty()) {
            System.out.println("Enter Starting point : ");
            starting_point = sc.next();
            break;
        }
        while (destination == null || destination.isEmpty()) {
            System.out.println("Enter destination : ");
            destination = sc.next();
            break;
        }
        while (distance == null || distance.isEmpty()) {
            System.out.println("Enter distance : ");
            distance = sc.next();
            break;
        }

        Route route = new Route(id, starting_point, destination, distance);
        routeRepository.create(route);
        System.out.println("Route Created Successfuly");
    }

    public static void list() {
        System.out.println("...........Route List...........");
        routeRepository.show()
                .stream()
                .forEach(x -> System.out.println(x));
    }

    public static void delete() {
        Long id = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to delete route: ");
        id = sc.nextLong();
        Route r = routeRepository.findById(id);
        if (r == null) {
            System.out.println("Route of Id" + id + " not found ");
        } else {
            routeRepository.delete(r);
            System.out.println("Route deleted successfully");
        }
    }

    public static void edit() {
        Long id = null;
        String starting_point = null;
        String destination = null;
        String distance = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to edit route: ");
        id = sc.nextLong();
        Route r = routeRepository.findById(id);
        if (r == null) {
            System.out.println("Route of Id " + id + " not found");
        } else {
            while (starting_point == null || starting_point.isEmpty()) {
                System.out.println("Enter Starting point : ");
                starting_point = sc.next();
                break;
            }
            while (destination == null || destination.isEmpty()) {
                System.out.println("Enter destination : ");
                destination = sc.next();
                break;
            }
            while (distance == null || distance.isEmpty()) {
                System.out.println("Enter distance : ");
                distance = sc.next();
                break;
            }
        }
        Route route = new Route(id, starting_point, destination, distance);
        routeRepository.edit(route);
        System.out.println("Route Edited Successfully");
    }
}
