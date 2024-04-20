package com.spring.ci;

public class Addition {
private int a;
private int b;

public Addition(double a, double b) {
	this.a=(int) a;
	this.b=(int)b;
	System.out.println("int Double");
}
public Addition(int a, int b) {
	this.a=a;
	this.b=b;
	System.out.println("int Constructor");
}



void doSum() {
	System.out.println("Sum is"+ (a+b));
}

}
