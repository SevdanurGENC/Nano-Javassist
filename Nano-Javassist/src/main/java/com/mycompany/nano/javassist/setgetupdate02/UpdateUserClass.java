/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.nano.javassist.setgetupdate02;

import javassist.*;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Nano
 */
public class UpdateUserClass {

    public static ClassPool cp;
    public static CtClass cc;
    public static CtMethod method;
    public static CtConstructor ctc;

    public static void main(String[] args) throws NotFoundException, CannotCompileException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        cp = ClassPool.getDefault();
        cc = cp.get("com.mycompany.nano.javassist.setgetupdate02.UserService");
        ctc = cc.getConstructors()[0];
        method = cc.getDeclaredMethod("temp");

        method.insertAt(22, "System.out.println($1);\n"
                + "        $1.setName(\"Sevdanur GENC\");\n"
                + "        System.out.println($1);");
        final User user = new User();

        user.setAge(37);
        user.setName("Sevdanur Nano GENC");
        UserService sp = (UserService) cc.toClass().getConstructor(User.class).newInstance(user);

        sp.temp(user);

    }
}
