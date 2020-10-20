/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nano.javassist.innerclass;

import javassist.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Nano
 */
public class UpdateSampleClass {

    public static void main(String[] args) throws NotFoundException, CannotCompileException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {

        ClassPool cp = ClassPool.getDefault();
        CtClass cc = cp.get("com.mycompany.nano.javassist.innerclass.SampleClass$InnerClass");
        CtConstructor ctc = cc.getConstructors()[0];

        ctc.setBody("{if(\"falseParameter\".equals($2)){$2=\"trueParameter\";} "
                + "this.temp = $2;"
                + "}");

        SampleClass.InnerClass sp = (SampleClass.InnerClass) 
                cc.toClass().getConstructor(SampleClass.class, String.class).newInstance(new SampleClass(), "falseParameter");

        System.out.println(sp.getInnerField());

        final SampleClass object = new SampleClass();
        final SampleClass.InnerClass old = object.new InnerClass("newParameter");

        System.out.println(old.getInnerField());
    }
}
