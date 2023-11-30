package StenYoshiGame;

class Character {
    String name;
    int health;
    int stamina;

    public Character(String name, int health, int stamina) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
    }

    public void displayStats() {
        System.out.println(name + "'s Stats:");
        System.out.println("Health: " + health);
        System.out.println("Stamina: " + stamina);
    }
    
    public void reduceHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("You received " + damage + " damage and has run out of health. Game Over!");
            System.out.println();
            
            restart start = new restart();
            start.playAgain();
    

        } else {
            System.out.println("You received " + damage + " damage. Remaining health: " + health);
        }
    }
    public void increaseHealth( int energy) {
        health += energy;

    }
}


