/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.repository;

import com.rasmijati.model.Booking;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasmi
 */
public class bookingRepository {

    private List<Booking> booking_list;

    public bookingRepository() {
        booking_list = new ArrayList<>();
    }

    public void create(Booking b) {
        this.booking_list.add(b);    //  it means booking_list of this class
//       booking_list.add(b);    it means booking_list of this class or may be another class
    }

    public List<Booking> show() {
        return booking_list;
    }

    public Booking findById(Long id) {
        for (Booking b : booking_list) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void delete(Booking b) {
        this.booking_list.remove(b);
    }

    public void edit(Booking b) {
        booking_list.stream()
                .filter(x -> x.getId()
                .equals(b.getId()))
                .forEach(x -> {
                    x.setBus_id(b.getBus_id());
                    x.setRoute_id(b.getRoute_id());
                    x.setUser_id(b.getUser_id());
                    x.setDate(b.getDate());
                    x.setSeats(b.getSeats());
                    x.setFare(b.getFare());
                });
    }
}
