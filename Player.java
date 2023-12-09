package MonsterGame;

public class Player {
    private String name;

    private Monster[] monsters;

    public Player(String name,Monster[] monsters) {
        this.name = name;
        this.monsters = monsters;
    }

    public Monster[] getMonsters() {
        return monsters;
    }

    public boolean hasMonstersAlive() {
        for (int i = 0; i < monsters.length; i++) {
            if (monsters[i].isMonsterAlive()) {
                return true;
            }
        }
        return false;
    }
    public String getName(){
        return name;
    }
}
