package com.dilipghawade.GavaGame.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("jump");
	}

	public void down() {
		System.out.println("Go in to a ole");

	}

	public void left() {
		System.out.println("Go Back");
	}

	public void right() {
		System.out.println("Acclerate");
	}
}
