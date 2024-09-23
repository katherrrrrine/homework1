package enemies;

import heros.Hero;

public class Spellcaster extends Enemy{
    public Spellcaster(int health, int damage){
        super(health);
        this.damage = damage;
    }
    //колдун наносит дополнительный урон
    public void spellDamage(Hero hero){
        hero.takeDamage(damage*2);
        System.out.println("Spellcaster uses spells");
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(damage);
        spellDamage(hero);
        System.out.println("Spellcaster attacks "+hero.getName()+". Damage: "+ damage);
    }
}
