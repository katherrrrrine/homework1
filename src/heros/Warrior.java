package heros;

import enemies.Enemy;
import java.util.Random;

public class Warrior extends Hero {

    public Warrior(String name, int health, int damage){
        super(name);
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(damage);
        System.out.println("Warrior attacks " + enemy.getClass().getSimpleName() + ". Damage: " + damage);
    }

    //воин может увернуться от удара
    @Override
    public void takeDamage(int damage){
        Random random = new Random();
        int dodge = random.nextInt(5);
        if (dodge != 2){
            this.health-=damage;
        } else
            System.out.println("Warrior dodges the blow");
    }
}
