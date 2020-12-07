package edu.sdccd.cisc191.e;

import java.util.Arrays;

public class BattleView {
	
	public BattleView() {
		
	}
	
	public static void draw() {
		
	}
	
	
	public static void printMoves(String[] moves) {
		System.out.println("\nYour Current Moves Are:");
		Arrays.asList(moves).forEach(move -> System.out.println(move));
	}
	
	public static void viewEnemyHealth(int health) {
		System.out.println("Enemy Health is: " + health);
	}
	
	public static void viewPlayerHealth(int health) {
		System.out.println("Your Health is: " + health);
	}
	
	public static void viewTurnCount(int count) {
		System.out.println("\n\nTURN " + count + "\n");
	}
	
	public static String getUserInput() {
		return Main.reader.nextLine();
	}
	
	public static void enemyDied() {
		System.out.println("An Enemy Has Died");
	}
	
	public static void enemyMoveMade(String move) {
		System.out.println("The enemy used the move: " + move);
	}
}
