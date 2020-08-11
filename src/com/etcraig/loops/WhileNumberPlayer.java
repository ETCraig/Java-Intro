package com.etcraig.loops;

public class WhileNumberPlayer {
	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquareUpToLimit() {
		int i = 1;
		while (i * i < limit) {
			System.out.println(i * i + " ");
			i++;
		}
		System.out.println();
	}

	public void printCubeUpToLimit() {
		int i = 1;
		while (i * i * i < limit) {
			System.out.println(i * i * i + " ");
			i++;
		}
		System.out.println();
	}
}
