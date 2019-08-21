package de.jescochrist.generalplugin.misc;

// Import packages
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

// Define class CheckSender
public class CheckSender {
	
	// Define method isPlayer
	public static boolean isPlayer(CommandSender sender) {
		// If commandsender sender is an instance of Player return true
		if (sender instanceof Player) return true;
		// If not return false
		else return false;
	}
	
}
