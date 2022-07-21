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
    Scanner sn = new Scanner(System.in);
    public Position position = new Position(0, 0);

    private int x = 0;
    private int y = 0;
    Piece piece = Piece.Empty;

    public TicTacToe(GamePlayersProvider gamePlayersProvider) {
        super(gamePlayersProvider);
    }

    public void Introduction() {
        System.out.println("Welcome to Tic Tac Toe!");
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

        board.createBoard();
        board.paintBoard();
        while ((!board.checkWinner(Piece.X) && !(board.checkWinner(Piece.O))) || !board.isFull()) {


            if (turn % 2 == 0) {
                piece = Piece.X;
                System.out.println("Please give me the position of your movement");
                System.out.println("-----------------------------------------------");
                System.out.println("Please, give me the position of X (1-3): ");
                x = Integer.parseInt(sn.nextLine());
                position.setX(x);
                System.out.println("Please, give me the position of y (1-3): ");
                y = Integer.parseInt(sn.nextLine());
                position.setY(y);
            } else {
                piece = Piece.O;
                System.out.println("PC's turn");
                System.out.println("-----------------------------------------------");

                x = rand.nextInt(3);
                position.setX(x);

                y = rand.nextInt(3);
                position.setY(y);

            }
            if (!board.checkMovement(position, piece)) {
                System.out.println("Choose a valid box");
                continue;
            }
            System.out.println("Your box position is: (" + (x) + ", " + (y ) + ")");
            board.putPiece(position, piece);
            board.paintBoard();
            turn++;
        }
        if (board.checkWinner(Piece.X)) {
            System.out.println("You won :)");
        } else if (board.checkWinner(Piece.O)) {
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