/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.rasmijati.model;

/**
 *
 * @author rasmi
 */
public class Booking {

    private Long id;
    private Long user_id;
    private Long bus_id;
    private Long route_id;
    private String date;
    private Long seats;
    private Double fare;

    public Booking(Long id, Long user_id, Long bus_id, Long route_id, String date, Long seats, Double fare) {
        this.id = id;
        this.user_id = user_id;
        this.bus_id = bus_id;
        this.route_id = route_id;
        this.date = date;
        this.seats = seats;
        this.fare = fare;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getBus_id() {
        return bus_id;
    }

    public void setBus_id(Long bus_id) {
        this.bus_id = bus_id;
    }

    public Long getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Long route_id) {
        this.route_id = route_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getSeats() {
        return seats;
    }

    public void setSeats(Long seats) {
        this.seats = seats;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "id=" + id + ", user_id=" + user_id + ", bus_id=" + bus_id + ", route_id=" + route_id + ", date=" + date + ", seats=" + seats + ", fare=" + fare;
    }
}
