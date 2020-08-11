package com.etcraig.loops;

public class WhileNumberPlayerRunner {
	public static void main(String[] args) {
		WhileNumberPlayer player = new WhileNumberPlayer(10);

		player.printSquareUpToLimit();

		player.printCubeUpToLimit();
	}
}
