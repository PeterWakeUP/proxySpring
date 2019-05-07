package com.example.proxy.jdk;


import com.example.proxy.cglib.GPMeipo;

public class TestFindLove {
	public static void main(String[] args) {
		
		try {

			Person obj1 = (Person)new Meipo().getInstance(new XiaoXingxing());
			System.out.println(obj1.getClass());
			obj1.findLove();
			System.out.println("+++++++++++++++++++++++++++++++++++++++");
			obj1.say();

			/*Person obj = (Person)new GPMeipo().getInstance(new XiaoXingxing().getClass());
			System.out.println(obj.getClass());
			obj.findLove();*/
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
