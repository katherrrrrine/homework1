import heros.*;
import enemies.*;

public class BattleGround {
    public static void main(String[] args) {
        Enemy vampire = new Vampire(200, 80);
        Enemy troll = new Troll(100, 50);
        Enemy spellcaster = new Spellcaster(500, 10);
        Hero warrior = new Warrior("Nils", 1000, 50);

        warrior.attackEnemy(vampire);
        vampire.attackHero(warrior);
        warrior.attackEnemy(troll);
        troll.attackHero(warrior);
        warrior.attackEnemy(spellcaster);
        spellcaster.attackHero(warrior);
    }
}
