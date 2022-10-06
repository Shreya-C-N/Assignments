package com.valtech.training.corejava.day1;

public abstract class Vehicle {
	public void start() {
		System.out.println("start button...");
	}
	public void stop() {
		System.out.println("stop button...");
	}
	public abstract void accelerate();
	public abstract void applyBrakes();
	public final void driveSomeDistance() {
		start();
		accelerate();
		applyBrakes();
		stop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle es =new ElectricScooter();
		es.driveSomeDistance();

	}

}
