/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nano.javassist.inserttoclass;

/**
 *
 * @author Nano
 */
public class SampleClass {

    public int writeMethodToScreen(int parameter) {
        System.out.println("Run to method ");
        System.out.println("this sample message one");
        System.out.println("this sample message two");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stop to method");
        return parameter + 1000;
    }
}
