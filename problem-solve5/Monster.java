/**
 * Purpose: Represents a monster with health and a name. The monster can take
 * damage,
 * regain health, roar at players, and display its current status.
 * 
 * @author ITSC 1213
 * @version Feb 01, 2025
 */
public class Monster {
    // Monster's current health points (cannot go below 0)
    private int health;
    // Monster's name for identification
    private String name;

    /**
     * Constructor to create a new Monster with specified name and health
     * 
     * @param name   The name of the monster (cannot be null)
     * @param health The initial health points of the monster (must be >= 0)
     */
    public Monster(String name, int health) {
        if (name == null) {
            throw new IllegalArgumentException("Monster name cannot be null");
        }
        if (health < 0) {
            throw new IllegalArgumentException("Initial health cannot be negative");
        }
        this.name = name;
        this.health = health;
    }

    /**
     * Reduces the monster's health by the specified amount of damage.
     * Health cannot go below 0.
     * 
     * @param dmg Amount of damage to take (must be >= 0)
     */
    public void takeDamage(int dmg) {
        if (dmg < 0) {
            throw new IllegalArgumentException("Damage amount cannot be negative");
        }
        this.health = Math.max(0, this.health - dmg);
    }

    /**
     * Increases the monster's health by the specified amount.
     * 
     * @param amount Amount of health to restore (must be >= 0)
     */
    public void heal(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Heal amount cannot be negative");
        }
        this.health += amount;
    }

    /**
     * Monster roars at a player, causing them to lose health from intimidation.
     * This is a special attack that always deals 5 damage.
     * 
     * @param p The player to intimidate (cannot be null)
     */
    public void roar(Player p) {
        if (p == null) {
            throw new IllegalArgumentException("Player cannot be null");
        }
        // Roar deals 5 damage to the player through intimidation
        p.takeDamage(5);
        System.out.println(this.name + " roars menacingly at " + p.getName() + "!");
    }

    /**
     * Displays the monster's current status including name and health.
     * This method prints directly to the console.
     */
    public void displayStatus() {
        System.out.println("Monster: " + this.name);
        System.out.println("Health: " + this.health);
    }

    /**
     * Gets the monster's name.
     * 
     * @return The monster's name (never null)
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the monster's current health.
     * 
     * @return The monster's current health points (always >= 0)
     */
    public int getHealth() {
        return this.health;
    }
}
