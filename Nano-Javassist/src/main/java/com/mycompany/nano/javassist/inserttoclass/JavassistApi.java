/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nano.javassist.inserttoclass;

import javassist.*;
import java.io.IOException;

/**
 *
 * @author Nano
 */
public class JavassistApi {

    public static ClassPool cp;
    public static CtClass cc;
    public static CtMethod method;
    public static SampleClass test;

    public static void main(String[] args) throws CannotCompileException, IOException {

        cp = ClassPool.getDefault();

        cc = null;
        try {
            cc = cp.get("com.mycompany.nano.javassist.inserttoclass.SampleClass");
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        method = null;
        try {
            method = cc.getDeclaredMethod("writeMethodToScreen");   //it's method name
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        try {
            method.insertAfter("System.out.println(\"add this message at the end\");");  //run: after to all code
            method.insertAt(17, "System.out.println(\"insert at line 16\");");
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        try {
            cc.toClass();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        cc.detach();

        test = new SampleClass();

        test.writeMethodToScreen(5);

        cc.writeFile("testSampleClass.class");  //this is new class file with new java line code
    }
}
