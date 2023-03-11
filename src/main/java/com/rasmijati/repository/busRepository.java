/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.repository;

import com.rasmijati.model.Bus;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasmi
 */
public class busRepository {

    private final List<Bus> bus_list;

    public busRepository() {
        bus_list = new ArrayList<>();
    }

    public void create(Bus b) {
        this.bus_list.add(b);
    }

    public List<Bus> show() {
        return bus_list;
    }

    public Bus findBusById(Long id) {
        for (Bus b : bus_list) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void delete(Bus b) {
        this.bus_list.remove(b);
    }

    public void edit(Bus b) {
        bus_list.stream()
                .filter(x -> x.getId()
                .equals(b.getId()))
                .forEach(x -> {
                x.setNumber(b.getNumber());
                x.setSeats(b.getSeats());
                x.setType(b.getType());
                }
                );
    }
}
