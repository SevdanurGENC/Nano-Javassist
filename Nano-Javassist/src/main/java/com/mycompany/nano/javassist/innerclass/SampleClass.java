/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nano.javassist.innerclass;

/**
 *
 * @author Nano
 */
public class SampleClass {
    
    public class InnerClass {
    
        String temp;

            public InnerClass(String temp) {
                System.out.println("start==================>");
                this.temp = temp;
                System.out.println("end==================>");
            }

            public String getInnerField() {
                return temp;
            }

            public void setInnerField(String temp) {
                this.temp = temp;
            }
        }
}
