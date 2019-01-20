package com.java18.iterfacestaticanddefaultmethods;

public class HelloImpl implements IHello {

	@Override
	public void sayHello() {		

	}
@Override
public void sayhello2() {
	System.out.println("In sayhello2 methods");
}
	public static void main(String[] args) {
		IHello hello = new HelloImpl();
		hello.sayhello2();
		IHello.sayStatic();
	}

}
