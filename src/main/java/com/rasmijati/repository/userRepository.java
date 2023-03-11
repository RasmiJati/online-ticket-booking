/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.repository;

import com.rasmijati.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author rasmi
 */
public class userRepository {

    private List<User> ulist;    // empty list of type user

    public userRepository() {
        ulist = new ArrayList<>();     //create list's object
    }

    public void create(User u) {
        this.ulist.add(u);
    }

    public List<User> show() {
        return ulist;
    }

    public User findUserById(Long id) {
        for (User u : ulist) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public void delete(User u) {
        this.ulist.remove(u);
    }

    public void edit(User u) {

        ulist.stream()
                .filter(x -> x.getId()
                .equals(u.getId()))
                .forEach(user -> {
                    user.setName(u.getName());
                    user.setEmail(u.getEmail());
                    user.setPhone(u.getPhone());
                    user.setPassword(u.getPassword());
                });
        
//        Predicate<User> p = new Predicate<User>() {  //predicate --> inerface
//            @Override
//            public boolean test(User t) {
//                if(t.getId().equals(u.getId())){
//                return false;
//            }
//        };

// Predicate<User> p = t -> t.getId()
//                              .equals(u.getId())
//            
    }
}
