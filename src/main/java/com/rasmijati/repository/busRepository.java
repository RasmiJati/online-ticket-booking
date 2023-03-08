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
    
    public void create(Bus b){
        bus_list.add(b);
    }
    
      
    public List<Bus> show(){
        return bus_list;
    }
}
