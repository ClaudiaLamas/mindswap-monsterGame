package MonsterGame;

public class Vampire extends Monster{

    private int biteHealChance;


    public Vampire(){
        super(MonsterType.VAMPIRE,"Vampire",7,15);
        this.biteHealChance = 30;

    }

    @Override
    void monsterAttack(Monster enemy){
        System.out.println(getName() + " attacks " + enemy.getName() + " for " + getAttackPoints() + " damage." + "Remaining health is:" + getHealthPoints());
        enemy.monsterDefend(getAttackPoints());

        if (Math.random() < (double) biteHealChance / 100){
            int healAmount = 5;
            heal(healAmount);
            System.out.println(getName() + " bites and heals for " + healAmount + ". Remaining health is "+ getHealthPoints());
        }
    }
}