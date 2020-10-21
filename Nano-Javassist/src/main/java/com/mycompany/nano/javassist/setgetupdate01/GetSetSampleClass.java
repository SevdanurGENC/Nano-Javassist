/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nano.javassist.setgetupdate01;

/**
 *
 * @author Nano
 */
public class GetSetSampleClass {

    private final String temp;

    public GetSetSampleClass(String temp) {   //constructor method
        this.temp = temp;
    }

    public String getTemp() {
        return temp;
    }
}
