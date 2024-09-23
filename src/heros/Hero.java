package heros;

import enemies.Enemy;

public abstract class Hero {

    public String name;
    public int health;
    public int damage;

    public Hero(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage){
        this.health-=damage;
    }
}
