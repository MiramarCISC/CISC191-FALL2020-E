package edu.sdccd.cisc191.e;

public class MainMenu implements Menu{

	private static String[] options = {"Start", "Exit"};
	public static boolean active;
	
	public static boolean enterPressed(String input) {
		switch (input) {
		case "Start":
			MenuController.exitMenu();
			return true;
		case "Exit":
			System.exit(0);
		default:
			return false;
		}
	}

	public static String[] getOptions() {
		return options;
	}
	
	public static void setActive(boolean active) {
		MainMenu.active = active;
	}
	
	public static boolean getActive() {
		return active;
	}
}
