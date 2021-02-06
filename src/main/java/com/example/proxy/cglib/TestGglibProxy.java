package com.example.proxy.cglib;


import com.example.proxy.cglib.test.bc44739;

public class TestGglibProxy {

    public static void main(String[] args) {
        try {

            YunZhongYu obj = (YunZhongYu)new GPMeipo().getInstance(YunZhongYu.class);
            /*obj.findLove();
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            obj.say();*/


            /**
             * cglib代理模式源码解析，生成的代理类代码见 F:\_project\dai li
             * 设计模式：代理模式（生成子类，重写父类方法，最后super调用父类方法）
             * 有缺陷：没完全反编译解析 -_-  ，生成的类存在反射代码是写死的，所以以上第一行代码不能注释，否则找不到类
             */
            System.out.println("\n\n==========================================================");
            GPMeipo gpMeipo = new GPMeipo();
            YunZhongYu proxy = new bc44739(gpMeipo);
            proxy.findLove();
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            proxy.say();
            /*--------------------------------------------------------------------------------------*/

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
