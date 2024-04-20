package com.spring.ci;

public class Person {
private String name;
private int personId;
private Certi certi;

public Person(String name, int personId, Certi ceri){
	this.name = name;
	this.personId =personId;
	this.certi = ceri;
}

@Override
public String toString() {
// 	return "Person [name=" + name + ", personId=" + personId + "]"; 
	return this.name + ":"+this.personId+"{"+this.certi.name+"}";
	
}
}
