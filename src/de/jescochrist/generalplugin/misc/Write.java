package de.jescochrist.generalplugin.misc;

// Import packages
import org.bukkit.entity.Player;

// Define class General
public class Write {
	
	// Define method writeToConsole
	public static void writeToConsole(String text) {
		// Output text from variable text to the console
		System.out.println(text);
	}
	
	// Define method writeToPlayer
	public static void writeToPlayer(Player target, String text) {
		// Output text from variable text to the player
		target.sendMessage(text);
	}
	
}
