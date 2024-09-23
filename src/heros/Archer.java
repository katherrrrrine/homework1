package heros;

import enemies.Enemy;
import java.util.Random;

public class Archer extends Hero{

    public Archer (String name, int health, int damage){
        super(name);
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void attackEnemy(Enemy enemy){
        Random random = new Random();
        int crit = random.nextInt(100);
        if (crit == 10){
            enemy.takeDamage(enemy.health);
            System.out.println("Archer deals critical damage");
        } else {
            enemy.takeDamage(damage);
            System.out.println("Archer attacks "+ enemy.getClass().getSimpleName()+". Damage: "+ damage);
        }
    }
}
