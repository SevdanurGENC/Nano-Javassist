/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nano.javassist.setgetupdate01;

import javassist.*;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Nano
 */
public class UpdateSampleClass {

    public static ClassPool cp;
    public static CtClass cc;
    public static CtMethod method;
    public static CtConstructor ctc;

    public static void main(String[] args) throws NotFoundException, CannotCompileException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {

        cp = ClassPool.getDefault();
        cc = cp.get("com.mycompany.nano.javassist.setgetupdate01.GetSetSampleClass");
        ctc = cc.getConstructors()[0];
        
        ctc.setBody("{temp=\"This is template message\";"
                + "this.temp = temp;}");
        GetSetSampleClass sp = (GetSetSampleClass) 
                cc.toClass().getConstructor(String.class).newInstance("temp");

        System.out.println(sp.getTemp());

        GetSetSampleClass pp = new GetSetSampleClass("HelloWorld");
        System.out.println(pp.getTemp());
    }
}
