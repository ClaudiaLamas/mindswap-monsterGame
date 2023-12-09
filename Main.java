package MonsterGame;

public class Main {
    public static void main(String[] args) {
        Monster[] player1Monsters = {new Werewolf(), new Vampire(), new Mummy()};
        Monster[] player2Monsters = {new Werewolf(), new Vampire(), new Mummy()};

        Player player1 = new Player("Player 1", player1Monsters);
        Player player2 = new Player("Player 2", player2Monsters);

        Game game = new Game(player1, player2);
        game.start();
    }
}