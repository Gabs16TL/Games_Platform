import game.Game;
import game.hangman.HangMan;
import game.tictactoe.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GamesPlatform {
    private final Scanner sn;
    private final Game[] games;
    private final ListOfPlayers listOfPlayers;

    public GamesPlatform() {
        sn = new Scanner(System.in);
        games = new Game[] {new TicTacToe(), new HangMan()};
        listOfPlayers = new ListOfPlayers();
    }

    public void run() {
        boolean exit = false;
        int option;
        System.out.println("\nWelcome to the game platform!");
        while (!exit) {
            showMenu();
            try {
                System.out.println("Choose an option: ");
                option = sn.nextInt();
                sn.nextLine();
                switch (option) {
                    case 1: showPlayers(); break;
                    case 2: createPlayer(); break;
                    case 3: playGame(games[0]); break;
                    case 4: playGame(games[1]); break;
                    case 5: exit = true; break;
                    default: System.out.println("Must be a number between 1 and 5"); break;
                }
            } catch (InputMismatchException e) {
                System.out.println("You have to enter a number.");
                sn.next();
            }
        }
        System.out.println("***************************\n");
        System.out.println("Thanks for playing!");
    }

    private void createPlayer() {
        System.out.println("Enter the new player name: ");
        String name = sn.nextLine();
        listOfPlayers.createPlayer(new Player(name));
    }

    private void showPlayers() {
        Player[] players = listOfPlayers.getPlayers();
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null)
                System.out.println((i + 1) + ". " + players[i].getName());
        }
    }

    private void playGame(Game game) {
        game.introdution();
        game.execute();
        game.resume();
    }


    private void showMenu() {
        System.out.println("\n***************************");
        System.out.println("1. Show Players");
        System.out.println("2. Create Player");
        System.out.println("3. Play TicTacToe");
        System.out.println("4. Play Hangman");
        System.out.println("5. Exit");
    }

}
