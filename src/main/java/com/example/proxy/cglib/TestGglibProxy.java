package com.example.proxy.cglib;


public class TestGglibProxy {
    public static void main(String[] args) {



        try {
            YunZhongYu obj = (YunZhongYu)new GPMeipo().getInstance(YunZhongYu.class);
            obj.findLove();
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            obj.say();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
