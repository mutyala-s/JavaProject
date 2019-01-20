package com.java18.iterfacestaticanddefaultmethods;

public interface IHello {
	public void sayHello();
	default void  sayhello2() {
		System.out.println("In INterface default methods");
	}
	public static void sayStatic() {
		System.out.println("In INterface sayStatic methods");
	}
	}
