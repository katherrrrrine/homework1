package enemies;

import heros.Hero;

import java.util.Random;

public class Troll extends Enemy {
    public Troll(int health, int damage) {
        super(health);
        this.damage = damage;
    }

    @Override
    public void attackHero(Hero hero) {
        //у тролля есть вероятность промаха
        Random random = new Random();
        int missing = random.nextInt(50);

        if (missing==10){
            System.out.println("Troll misses!");
        } else {
            System.out.println("Troll attacks "+hero.getName()+". Damage: "+ damage);
            hero.takeDamage(damage);

        }
    }
}
