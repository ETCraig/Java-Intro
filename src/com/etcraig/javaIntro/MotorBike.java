package com.etcraig.javaIntro;

public class MotorBike {

	private int speed;

	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	void start() {
		System.out.println("Bike Started.");
	}

}
