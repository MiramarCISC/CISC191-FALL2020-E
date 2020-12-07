package edu.sdccd.cisc191.e;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
	private static boolean gameOver = false;
	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		setup();
		while (!gameOver) {
			loop();
		}
	}
	
	public static void setup() {
		MoveList list = new MoveList();
		BattleController model = new BattleController();
		MenuController menus = new MenuController();
		JsonIO jsonWriter = new JsonIO("MoveList.json");
		MenuController.onStart();
		while(!gameOver) {
			BattleController.turnIteration();
		}
		System.out.println("GameOver");
	}
	
	
	
	public static void saveMoveList() {
		try {
			FileWriter writer = new FileWriter("MoveList");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void gameOver() {
		gameOver = true;
	}
	
	public static void loop() {
		BattleController.turnIteration();
	}
}
