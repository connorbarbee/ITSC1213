# ITSC 1213 - Problem Solve 6 - Part 1
## **1. Understanding the `Player` Class**
### **Attributes**
- What attributes (fields) does the `Player` class have? Describe their purpose.
  - name, hp, and attack power - hp for health, the name of the player (ex wizard,) and their strength level.

### **Methods**
- What does the `attack()` method do? What parameter does it take?
  - The attack method subtracts HP from an alive target (monster).
- How does the `takeDamage()` method modify the player's state?
  - Reduces HP, never goes below 0.
- What does the `isAlive()` method return, and how is it used?
  - Returns HP > 0, decides turns/game over.

### **General Understanding**
- How do players interact with monsters in this game?
  - Turn-based, players pick a living monster and attack them.
- What do you think will happen when a player's `hp` reaches 0?
  - They can no longer act.

---

## **2. Understanding the `Monster` Class**
### **Attributes**
- What attributes does the `Monster` class have? How do they compare to the attributes of `Player`?
  - Same kinds as player - name, hp, and attack power.

### **Methods**
- How is the `attack()` method similar to the one in `Player.java`? How is it different?
  - The monsters are stored within an array, but otherwise it uses the same attributes. 
- What happens when the `takeDamage()` method is called on a monster?
  - HP is lowered, again clamped to 0 as minimum
- How does the `isAlive()` method work in the Monster class?
  - It's true while hp > 0.

### **General Understanding**
- How do monsters interact with players in this game?
  - Monsters act turn-based, during theirs they attack the player.
- What do you predict will happen when a monster's `hp` reaches 0?
  - The monster cannot/won't attack any further.

---

## **3. Comparing `Player` and `Monster` Classes**
- List two similarities between `Player` and `Monster` classes.
  - 
- List two differences between `Player` and `Monster` classes.
  - Stats are differnt, player doesn't use an array.
- Based on your understanding, what role do these classes play in the `BattleSimulation.java` file?
  - They interact together along with the other aspects of the code (print statements, for loops, array(s)) in order to determine the primary outcome of the battle.

---

## **4. Predictions for `BattleSimulation.java`**
- What do you think the `arePlayersAlive()` and `areMonstersAlive()` methods will do?
  - It will scan to determine whether or not the players/monsters have 0hp or not. 
- Why might we need methods like `getFirstAlivePlayer()` and `getFirstAliveMonster()`?
  - It can be used to determine which target within the simulation will be hit first, ensures target will be valid. 
- How do you expect `displayStatus()` to work? What information should it show?
  - It should print out along with format the results of the turns and game in general.
