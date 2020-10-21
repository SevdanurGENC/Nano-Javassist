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
import javassist.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class UpdateSampleClass {

    public static ClassPool cp;
    public static CtClass cc;
    public static CtMethod method; 
    
    public static void main(String[] args) throws NotFoundException, CannotCompileException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException,
            IOException {

        cp = ClassPool.getDefault();

        cc = null;
        try {
            cc = cp.get("com.mycompany.nano.javassist.interfaceclass.SubSampleClass$1");
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        method = null;
        try {
            method = cc.getDeclaredMethod("temp");
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        try {
            method.insertAfter("System.out.println(\"add this message at the end\");");
             method.insertAt(21,"System.out.println(\"insert at line22, HELLO WORLD \" + $1);$1=\"This is new message\";" +
                    "");
            
            
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }

        try {
            cc.toClass();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }

        cc.detach();
        final SubSampleClass object = new SubSampleClass();
        object.method(null);

    }

}
