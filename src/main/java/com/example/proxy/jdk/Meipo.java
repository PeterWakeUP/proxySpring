package com.example.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class Meipo implements InvocationHandler {
	
	private Person target;

	public Meipo() {
	}

	public Meipo(Person target) {
		this.target = target;
	}

	public Object getInstance(Person target) throws Exception{
		this.target = target;
		Class clazz = target.getClass();
		System.out.println("bei dai li de class is:"+clazz);
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("i m meipo");
		System.out.println("------------");

		method.invoke(this.target, args);
		System.out.println("------------");
		System.out.println("if, ready");
		
		return null;
	}

}
