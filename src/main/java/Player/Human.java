package Player;


import game.tictactoe.Position;

import java.util.Scanner;

public class Human extends Player {
    private final Scanner sn = new Scanner(System.in);
    public Human(String playerName) {
        super(playerName);
    }

    @Override
    public void processResult(int result) {

    }

    @Override
    public String chooseWord() {
        System.out.println("\nEnter the secret word: ");
        return sn.nextLine();
    }

    @Override
    public char giveLetter() {
        System.out.println("\nEnter a letter: ");
        return sn.nextLine().charAt(0);
    }

    @Override
    public Position putMark() {
        System.out.println("Enter position X: ");
        int x = sn.nextInt();
        System.out.println("Enter position Y: ");
        int y = sn.nextInt();
        return new Position(x,y);
    }

}
