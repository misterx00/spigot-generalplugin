package de.jescochrist.generalplugin.support;

/**
 * Contains code written by desht:
 * https://github.com/desht/dhutils/blob/master/Lib/src/main/java/me/desht/dhutils/cuboid/Cuboid.java
 * or
 * https://gitlab.intranet/cloned-spigot-plugins/dhutils/blob/master/Lib/src/main/java/me/desht/dhutils/cuboid/Cuboid.java
 */

// Import packages
import org.bukkit.Location;
import org.bukkit.World;

// Define class Cuboid
public class Cuboid {
	
	// Define class variables
	private World world;
	private int lowerX, higherX, lowerY, higherY, lowerZ, higherZ;
	
	// Define the constructor (2x Location)
	public Cuboid(Location l1, Location l2) {
		
		// If the l1 world differs from the l2 world
		if (!(l1.getWorld().equals(l2.getWorld()))) {
			// Throw exception
			throw new IllegalArgumentException("Locations need to be in the same world");			
		}
		
		// Calculate lower and higher values
		this.lowerX = Math.min(l1.getBlockX(), l2.getBlockX());
		this.higherX = Math.max(l1.getBlockX(), l2.getBlockX());
		this.lowerY = Math.min(l1.getBlockY(), l2.getBlockY());
		this.higherY = Math.max(l1.getBlockY(), l2.getBlockY());
		this.lowerZ = Math.min(l1.getBlockZ(), l2.getBlockZ());
		this.higherZ = Math.max(l1.getBlockZ(), l2.getBlockZ());
		
	}
	
	// Define the constructor (World, 6x int)
	public Cuboid(World world, int x1, int x2, int y1, int y2, int z1, int z2) {
		
		// Calculate lower and higher values
		this.lowerX = Math.min(x1, x2);
		this.higherX = Math.max(x1, x2);
		this.lowerY = Math.min(y1, y2);
		this.higherY = Math.max(y1, y2);
		this.lowerZ = Math.min(z1, z2);
		this.higherZ = Math.max(z1, z2);
		
	}
	
	// Define method getWorld
	public World getWorld() {
		return this.world;
	}
	
	// Define method getLowerX
	public int getLowerX() {
		return this.lowerX;
	}
	
	// Define method getHigherX
	public int getHigherX() {
		return this.higherX;
	}
	
	// Define method getLowerY
	public int getLowerY() {
		return this.lowerY;
	}
	
	// Define method getHigherY
	public int getHigherY() {
		return this.higherY;
	}
	
	// Define method getLowerZ
	public int getLowerZ() {
		return this.lowerZ;
	}
	
	// Define method getHigherZ
	public int getHigherZ() {
		return this.higherZ;
	}
	
	// Define method contains (World, 3x int)
	public boolean contains(World w, int x, int y, int z) {
		// If the given world and the cuboid world don't differ and the coordinates are contained by the cuboid return true
		return this.world.equals(w) && x >= this.lowerX && x <= this.higherX && y >= this.lowerY && y <= this.higherY && z >= this.lowerZ && z <= this.higherZ;
	}
	
	// Define method contains (Location)
	public boolean contains(Location l) {
		// If the location is contained by the cuboid
		return contains(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ());
	}
	
}
