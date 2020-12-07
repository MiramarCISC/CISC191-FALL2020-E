package edu.sdccd.cisc191.e;

public class MenuController {
	private static MainMenu mainMenu;
	private static boolean onMenu = true;
	
	public MenuController() {
		mainMenu = new MainMenu();
	}
	
	public static void onStart() {
		mainMenu.setActive(true);
	}
	
	public static void exitMenu() {
		onMenu = false;
	}
	
	public static void enterMenu() {
		onMenu = true;
	}
	
	
	public static void getUserInput() {
		
	}
}
