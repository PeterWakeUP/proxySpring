package com.example.proxy.jdk;


import com.example.proxy.cglib.GPMeipo;
import com.example.proxy.jdk.test.Proxy0;

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


			/*-------------jdk代理模式源码解析，生成的代理类代码见 F:\_project\dai li ---------------*/
			System.out.println("\n\n-----------------------------------------");
			Person xiaoxingxing = new XiaoXingxing();
			Meipo meipo = new Meipo(xiaoxingxing);
			Person proxy0 = new Proxy0(meipo);
			proxy0.findLove();
			System.out.println("+++++++++++++++++++++++++++++++++++++++");
			proxy0.say();
			/*----------------------------------------------------------------------------*/


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
