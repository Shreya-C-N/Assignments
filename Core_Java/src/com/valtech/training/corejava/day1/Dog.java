package com.valtech.training.corejava.day1;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
System.out.println("Barking");
	}
	public static void main(String[] args) {
		Animal a = new Dog();
		a.makeSound();
		
	}

}
