/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.rasmijati.model;

/**
 *
 * @author rasmi
 */
public class Route {

    Long id;
    String starting_point;
    String destination;
    Long distance;  /*int*/

    public Route(Long id, String starting_point, String destination, Long distance) {
        this.id = id;
        this.starting_point = starting_point;
        this.destination = destination;
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStarting_point() {
        return starting_point;
    }

    public void setStarting_point(String starting_point) {
        this.starting_point = starting_point;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Route{" + "id=" + id + ", starting_point=" + starting_point + ", destination=" + destination + ", distance=" + distance + "km" +'}';
    }
}
