/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nano.javassist.setgetupdate02;

/**
 *
 * @author Nano
 */
public class UserService {

    User user;

    public UserService(User user) {   //constructor method
        this.user = user;
    }

    void temp(User user) {

        System.out.println("line21");
        System.out.println("line22");

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
