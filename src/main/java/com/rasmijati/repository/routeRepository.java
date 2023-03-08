/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.repository;

import com.rasmijati.model.Route;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasmi
 */
public class routeRepository {

    private List<Route> route_list;

    public routeRepository() {
        route_list = new ArrayList<>();
    }

    public void create(Route r) {
        this.route_list.add(r);
    }

    public List<Route> show() {
        return route_list;
    }
}
