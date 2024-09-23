package enemies;

import auxiliary.Mortal;
import heros.Hero;

public abstract class Enemy implements Mortal {

    public int health;
    public int damage;

    public Enemy(int health){
        this.health = health;
    }

    public boolean isAlive(){
        if(health>0){
            return true;
        }
        else return false;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
        this.health-=damage;
    }

    public abstract void attackHero(Hero hero);

}
