package MonsterGame;

class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        boolean player1Attacker = true;
        while (player1.hasMonstersAlive() && player2.hasMonstersAlive()) {
            if (player1Attacker) {
                playRound(player1, player2);
            } else {
                playRound(player2, player1);
            }
            player1Attacker = !player1Attacker;

        }

        if (!player1.hasMonstersAlive()) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }
    }

    private void playRound(Player attacker, Player defender) {
        System.out.println("-".repeat(10));
        System.out.println("****** " + attacker.getName() + "'s turn: ********");
        System.out.println("-".repeat(10));

        for (int i = 0; i < attacker.getMonsters().length; i++) {
            Monster monster = attacker.getMonsters()[i];
            if (monster.isMonsterAlive()) {
                Monster opponent = getRandomAliveMonster(defender);
                if (opponent != null) {
                    monster.monsterAttack(opponent);

                    if (!opponent.isMonsterAlive()) {
                        System.out.println(opponent.getName() + " has been defeated.");
                    }
                }
            }
        }
    }

    private Monster getRandomAliveMonster(Player player) {
        Monster[] aliveMonsters = new Monster[player.getMonsters().length];
        int count = 0;

        for (int i = 0; i < player.getMonsters().length; i++) {
            Monster monster = player.getMonsters()[i];
            if (monster.isMonsterAlive()) {
                aliveMonsters[count] = monster;
                count++;
            }
        }

        if (count > 0) {
            int randomIndex = (int) (Math.random() * count);
            return aliveMonsters[randomIndex];
        } else {
            return null; // No alive monsters
        }
    }
}






