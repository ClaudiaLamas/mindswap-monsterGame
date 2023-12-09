package MonsterGame;

public abstract class Monster {
    private String name;
    private int attackPoints;
    private int healthPoints;
    private MonsterType monsterType;

    public Monster(MonsterType type,String name, int attackPoints, int healthPoints) {
        this.monsterType = type;
        this.name = name;
        this.attackPoints = attackPoints;
        this.healthPoints = healthPoints;

    }

    abstract void monsterAttack(Monster enemy);

    public void monsterDefend(int damage) {
        healthPoints -= damage;
        System.out.println("you dealt " + damage + ". remaining health is:" + healthPoints);
    }

    public boolean isMonsterAlive() {
        return healthPoints > 0;
    }

    public String getName() {
        return name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void heal(int amount) {
        healthPoints += amount;
    }

    public MonsterType getMonsterType() {
        return monsterType;
    }
}