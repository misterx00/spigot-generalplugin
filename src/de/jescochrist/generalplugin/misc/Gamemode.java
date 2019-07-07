package de.jescochrist.generalplugin.misc;

// Import packages
import org.bukkit.entity.Player;
import org.bukkit.GameMode;

// Define class Gamemode
public class Gamemode {
	
	// Define method checkGamemode
	public static GameMode checkGamemode(Player p) {
		// Return players gamemode
		return p.getGameMode();
	}
	
	// Define method setGamemode
	public static void setGamemode (Player p, GameMode g) {
		// Set players gamemode
		p.setGameMode(g);
	}
	
}
