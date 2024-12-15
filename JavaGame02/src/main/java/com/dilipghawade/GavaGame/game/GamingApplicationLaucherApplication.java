package com.dilipghawade.GavaGame.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dilipghawade.GavaGame.game")
public class GamingApplicationLaucherApplication {
	

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
//		var game = new PackmanGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
		
		try (var context = new AnnotationConfigApplicationContext(GamingApplicationLaucherApplication.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		}

	}

}
