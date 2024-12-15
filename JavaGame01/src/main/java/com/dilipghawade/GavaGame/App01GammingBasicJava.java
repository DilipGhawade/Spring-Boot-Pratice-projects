package com.dilipghawade.GavaGame;

import com.dilipghawade.GavaGame.game.*;

public class App01GammingBasicJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PackmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
