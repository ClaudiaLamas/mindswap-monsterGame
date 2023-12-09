package MonsterGame;

public class Mummy extends Monster {
    private int consecutiveAttacks;
    private int maxConsecutiveAttacks;

    public Mummy() {
        super(MonsterType.MUMMY,"Mummy", 9, 25);
        this.maxConsecutiveAttacks = 2;
    }

    @Override
    void monsterAttack(Monster enemy) {
        if (consecutiveAttacks < maxConsecutiveAttacks) {
            System.out.println(getName() + " attacks " + enemy.getName() + " for " + getAttackPoints() + " damage." + "Remaining health is:" + getHealthPoints());
            enemy.monsterDefend(getAttackPoints());
            consecutiveAttacks++;
        } else {
            System.out.println(getName() + " tries to attack but fails, instead it takes damage.");
            monsterDefend(5);
            consecutiveAttacks = 0;
        }
    }


}
