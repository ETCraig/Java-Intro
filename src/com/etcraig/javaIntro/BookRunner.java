package com.etcraig.javaIntro;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(40);

		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(45);

		artOfComputerProgramming.increaseNumberOfCopies(20);
		effectiveJava.decreaseNumberOfCopies(45);
		cleanCode.increaseNumberOfCopies(50);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}
