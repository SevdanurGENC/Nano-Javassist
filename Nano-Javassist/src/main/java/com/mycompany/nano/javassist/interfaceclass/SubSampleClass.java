/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nano.javassist.interfaceclass;

/**
 *
 * @author Nano
 */
public class SubSampleClass {

    public static void method(String[] args) {

        new InterfaceSampleClass() {
            @Override
            public void temp(String parameter) {
                System.out.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
                System.out.println("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
                System.out.println("It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
                System.out.println("It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

                System.out.println("Lorem Ipsum is : " + parameter);
            }
        }.temp("=> This is temp message");
    }
}
