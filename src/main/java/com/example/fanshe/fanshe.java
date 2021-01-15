package com.example.fanshe;

import com.example.fanshe.dto.Fruits;

import java.lang.reflect.Method;


public class fanshe {

    public static void main(String[] arg) throws Exception{
        Class clz = Class.forName("com.example.fanshe.dto.Fruits");
        /*Method[] methods = clz.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }*/

       /* Field[] fields = clz.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field);
        }*/

        /*Field field = clz.getDeclaredField("name");
        System.out.println(field);*/

        /*Method method = clz.getMethod("setName", String.class);
        System.out.println(method);*/

        Fruits apple = (Fruits) clz.getConstructor(String.class, int.class).newInstance("苹果", 5);
        System.out.println(apple);
        Method method = clz.getMethod("setName", String.class);
        method.invoke(apple, "苹果12");
        System.out.println(apple);
    }
}
