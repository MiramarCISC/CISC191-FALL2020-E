package edu.sdccd.cisc191.e;

import java.util.stream.Stream;

public class ViewMenu {
	public static void viewMenu(String[] menuItems, String header) {
		System.out.println(header);
		Stream.of(menuItems).forEach(item -> System.out.println(item));
	}
}
