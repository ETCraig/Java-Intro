package com.etcraig.javaIntro;

public class Book {
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNumberOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNumberOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}
}
