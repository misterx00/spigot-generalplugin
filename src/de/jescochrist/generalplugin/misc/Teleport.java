package de.jescochrist.generalplugin.misc;

// Import packages
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.World;

// Define class Teleport
public class Teleport {
	
	// Define method teleportToCoordinates
	public static void teleportTargetToCoordinates(Player target, World w, int x, int y, int z) {
		
		// Define new location
		Location l = new Location(w, x + 0.5, y, z + 0.5);
		
		// Teleport target
		target.teleport(l);
		
	}
	
	// Define method teleportToPlayer
	public static void teleportTargetToPlayer(Player target, Player teleporttarget) {
		
		// Define new location with coordinates from teleporttarget
		Location l = teleporttarget.getLocation();
		
		// Teleport target
		target.teleport(l);
		
	}
	
}
