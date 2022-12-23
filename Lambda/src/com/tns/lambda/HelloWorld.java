package com.tns.lambda;

public class HelloWorld {

	public static void main(String[] args) {
		Message msg=()->{System.out.println("hello all");
		System.out.println("good evening");
		System.out.println("hi");};
		msg.display();

	}

}
