package heros;

import enemies.Enemy;

public class Mage extends Hero{

    public Mage(String name, int health, int damage){
        super(name);
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void attackEnemy(Enemy enemy){
        if (this.health <= 100){
            System.out.println("Mage attacks enemy " + enemy.getClass().getSimpleName() + ". Damage: "+ damage*3);
            enemy.takeDamage(damage*3);
        }
        System.out.println("Mage attacks enemy " + enemy.getClass().getSimpleName() + ". Damage: "+ damage);
        enemy.takeDamage(damage);
    }
}
