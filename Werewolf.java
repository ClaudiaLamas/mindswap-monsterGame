package MonsterGame;

public class Werewolf extends Monster {
    public Werewolf() {
        super(MonsterType.WEREWOLF,"Werewolf",8, 20);
    }

    @Override
    void monsterAttack(Monster enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " for " + getAttackPoints() + " damage." + "Remaining health is:" + getHealthPoints());
        enemy.monsterDefend(getAttackPoints());
    }

}
