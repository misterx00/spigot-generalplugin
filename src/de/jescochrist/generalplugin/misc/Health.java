package de.jescochrist.generalplugin.misc;

// Import packages
import org.bukkit.entity.Player;

// Define class General
public class Health {
	
	// Define method setPlayerHealth
	public static void setPlayerHealth(Player target, int health) {
		// Set players health
		target.setHealth(health);
	}
	
	// Define method setPlayerFood
	public static void setPlayerFood(Player target, int food) {
		// Set players food
		target.setFoodLevel(food);
	}
	
	// Define method setPlayerHealthFood
	public static void setPlayerHealthFood(Player target, int health, int food) {
		// Set players health
		target.setHealth(health);
		// Set players food
		target.setFoodLevel(food);
	}
	
}
