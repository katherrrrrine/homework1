package enemies;

import heros.Hero;

public class Vampire extends Enemy{

    public Vampire(int health, int damage){
        super(health);
        this.damage = damage;
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Vampire attacks "+hero.getName()+". Damage: "+ damage);
        hero.takeDamage(damage);
        //при атаке на героя часть здоровья восстанавливается
        this.health += 5;
    }
}
