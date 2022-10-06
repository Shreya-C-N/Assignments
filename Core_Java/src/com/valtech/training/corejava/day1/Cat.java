package com.valtech.training.corejava.day1;

public class Cat implements Animal {
	public void makeSound() {
		// TODO Auto-generated method stub
System.out.println("Meow");
	}
	public static void main(String[] args) {
		Animal a = new Cat();
		a.makeSound();
		
}
}
