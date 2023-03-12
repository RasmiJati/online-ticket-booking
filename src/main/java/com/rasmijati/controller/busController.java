/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.Bus;
import com.rasmijati.repository.busRepository;
import java.util.Scanner;

/**
 *
 * @author rasmi
 */
public class busController {

    private static busRepository busRepository;

    public void crudOption(busRepository busRepository) {
        this.busRepository =busRepository;
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println(".................................................................");
            System.out.println("Choose an operation from below : ");
            System.out.println("..................................................................");
            System.out.println("Enter 1 to create");
            System.out.println("Enter 2 to list");
            System.out.println("Enter 3 to delete");
            System.out.println("Enter 4 to edit");
            System.out.println("Enter 5 to exit");
            System.out.println(".................................................................");
            choice = sc.next();
            switch (choice) {
                case "1":
                    create();
                    System.out.println("..................................................");
                    break;
                case "2":
                    list();
                    System.out.println(".......................................................");
                    break;
                case "3":
                    delete();
                    System.out.println(".......................................................");
                    break;
                case "4":
                    edit();
                    System.out.println(".......................................................");
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid option");
            }
        } while (!choice.equals("0"));
    }

    public static void create() {
        Long id = null;
        String number = null;
        String type = null;
        String seats = null;
        Scanner sc = new Scanner(System.in);
        while (id == null) {
            System.out.println("Enter Bus Id : ");
            String bid = sc.next();
            try {
                id = Long.parseLong(bid);
            } catch (Exception e) {
                System.err.println("Error");
                id = null;
            }
        }
        while (number == null || number.isEmpty()) {
            System.out.println("Enter bus number : ");
            number = sc.next();
            break;
        }

        while (type == null || type.isEmpty()) {
            System.out.println("Enter bus type:");
            type = sc.next();
            break;
        }

        while (seats == null || seats.isEmpty()) {
            System.out.println("Enter number of seat: ");
            seats = sc.next();
            break;
        }

        Bus bus = new Bus(id, number, type, seats);
        busRepository.create(bus);
        System.out.println("Bus Created Successfully");
    }

    public static void list() {
        System.out.println("....................All Bus List....................");
        busRepository.show()
                .stream()
                .forEach(x -> System.out.println(x));
    }

    public static void delete() {
        System.out.println("Enter Id of user to delete : ");
        Scanner sc = new Scanner(System.in);
        Long id = sc.nextLong();
        Bus bus = busRepository.findBusById(id);
        if (bus == null) {
            System.out.println("Bus with id " + id + "not found ");
        } else {
            busRepository.delete(bus);
            System.out.println("Bus with id " + id + "deleted successfully");
        }
    }

    public static void edit() {
        Long id = null;
        String number = null;
        String type = null;
        String seats = null;
        Scanner sc = new Scanner(System.in);
        System.out.println(".........Edit Operation........");
        System.out.println("Enter Bus id : ");
        String bid = sc.next();
        try {
            id = Long.parseLong(bid);
        } catch (NumberFormatException e) {
            System.err.println("Error");
            id = null;
        }
        Bus bus = busRepository.findBusById(id);
        if (bus == null) {
            System.out.println("Bus of id  " + id + " not found:");
        } else {
            while (number == null || number.isEmpty()) {
                System.out.println("Enter bus number : ");
                number = sc.next();
                break;
            }

            while (type == null || type.isEmpty()) {
                System.out.println("Enter bus type:");
                type = sc.next();
                break;
            }

            while (seats == null || seats.isEmpty()) {
                System.out.println("Enter number of seat: ");
                seats = sc.next();
                break;
            }

            Bus b = new Bus(id, number, type, seats);
            busRepository.edit(b);
            System.out.println("Bus Edited Successfully");
        }
    }
}
