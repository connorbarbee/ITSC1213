/**
 * Purpose: Represents a player in the game with health, gold, and experience points.
 *
 * @author  ITSC 1213
 * @version Feb 01, 2025
 */
public class Player {
    private String name;
    private int health;
    private int gold;
    private int xp;
    private static final int MAX_HEALTH = 100;

    /**
     * Creates a new Player with specified starting values
     * @param name The player's name
     * @param startHealth Initial health points (1-100)
     * @param startGold Initial gold amount
     * @param startXP Initial experience points
     */
    public Player(String name, int startHealth, int startGold, int startXP) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
        this.health = Math.min(Math.max(1, startHealth), MAX_HEALTH);
        this.gold = Math.max(0, startGold);
        this.xp = Math.max(0, startXP);
    }

    /**
     * Increases the player's experience points
     * @param amount Amount of XP to gain
     */
    public void gainXp(int amount) {
        if (amount > 0) {
            this.xp += amount;
        }
    }

    /**
     * Reduces player's health by damage amount
     * @param dmg Amount of damage to take
     */
    public void takeDamage(int dmg) {
        if (dmg > 0) {
            this.health = Math.max(0, this.health - dmg);
        }
    }

    /**
     * Heals the player by the specified amount
     * @param amount Amount of health to restore
     */
    public void heal(int amount) {
        if (amount > 0) {
            this.health = Math.min(MAX_HEALTH, this.health + amount);
        }
    }

    /**
     * Displays the player's current status
     */
    public void displayStatus() {
        System.out.println("Player: " + this.name);
        System.out.println("Health: " + this.health + "/" + MAX_HEALTH);
        System.out.println("Gold: " + this.gold);
        System.out.println("Experience: " + this.xp);
    }

    /**
     * Gets the player's name
     * @return The player's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the player's current health
     * @return Current health points
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Gets the player's gold amount
     * @return Current gold amount
     */
    public int getGold() {
        return this.gold;
    }

    /**
     * Gets the player's experience points
     * @return Current XP amount
     */
    public int getXp() {
        return this.xp;
    }
}
