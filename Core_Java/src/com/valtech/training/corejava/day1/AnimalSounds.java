package com.valtech.training.corejava.day1;

public class AnimalSounds {
public void disturb(Animal a) {
	a.makeSound();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnimalSounds as =new AnimalSounds();
as.disturb(new Cat());
as.disturb(new Dog());
	}

}