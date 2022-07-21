package game.tictactoe;

import Player.GamePlayersProvider;
import Player.Player;
import Player.Bot;
import game.Game;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe extends Game {
    public int NumberOfPlayers;
    private int turn = 2;
    private final Random rand = new Random();
    TicTacToe ttt;
    Scanner sn = new Scanner(System.in);

    public TicTacToe(GamePlayersProvider gamePlayersProvider) {
        super(gamePlayersProvider);
    }

    public void Introduction() {

        System.out.println("\nWelcome to Tic Tac Toe!");
    }

    @Override
    public void Resume() {

    }

    @Override
    public void Execute() {
        Board board = new Board();
        Player player1 = SelectPlayers();
        Player player2 = SelectPlayers();
        Player[] players = AssignRoles(player1, player2);
        board.CreateBoard();
        board.PaintBoard();
        System.out.println("Welcome to Tic-Tac-Toe");
        while ((!board.checkWinner('X') && !(board.checkWinner('O'))) || !board.fullBoard()) {
            int x;
            int y;
            char piece;

            if (turn % 2 == 0) {
                piece = 'X';
                System.out.println("Please give me the position of your movement");
                System.out.println("-----------------------------------------------");

                System.out.println("Enter x: ");
                x = Integer.parseInt(sn.nextLine());
                System.out.println("Enter y: ");
                y = Integer.parseInt(sn.nextLine());
            } else {
                piece = 'O';
                System.out.println("PC's turn");
                System.out.println("-----------------------------------------------");

                x = rand.nextInt(3);
                y = rand.nextInt(3);
            }
            if (!board.checkMovement(x, y, piece)) {
                System.out.println("Choose a valid box");
                continue;
            }
            System.out.println("You will move to: (" + (x) + ", " + (y) + ")");
            board.Movement(x, y, piece);
            board.PaintBoard();
            turn++;
        }
        if (board.checkWinner('X')) {
            System.out.println("You won :)");
        } else if (board.checkWinner('O')) {
            System.out.println("PC won");
        } else {
            System.out.println("It was a tie :O");
        }
    }


    @Override
    public Player[] AssignRoles(Player player1, Player player2) {
        return new Player[0];
    }

    @Override
    public Player SelectPlayers() {
        return new Bot("");
    }

}
