/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.rasmijati.model;

/**
 *
 * @author rasmi
 */
public class Bus {

    Long id;
    String number;
    String type;
    Long seats;

    public Bus(Long id, String number, String type, Long seats) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.seats = seats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSeats() {
        return seats;
    }

    public void setSeats(Long seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + id + ", number=" + number + ", type=" + type + ", seats=" + seats + '}';
    }
}
