/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.rasmijati.repository;

import com.rasmijati.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasmi
 */
public class userRepository {

    private List<User> ulist;    // empty list

    public userRepository() {
        ulist = new ArrayList<>();     //create list's object
    }
    
    public void create(User u){
        this.ulist.add(u);
    }
            
    public List<User> show(){
        return ulist;
    }
    
}
