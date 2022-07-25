package game.tictactoe;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;


public class BoardTest {
    Board board;
    Piece[][] squares = new Piece[3][3];
    Position position;
    Piece piece;

    @Before
    public void init() {
        board = new Board();
        board.createBoard();
        position = new Position(1, 1);
        piece = Piece.X;
        board.putPiece(position, piece);
    }

    @Test
    public void testCreateBoard() {
    }

    @Test
    public void testPaintBoard() {
    }

    @Test
    public void testPutPiece() {
        Board b = new Board();
        Position p = new Position(3, 3);
        Piece pi = Piece.O;
        assertEquals(board.putPiece(position, piece), b.putPiece(p, pi));
    }

    @Test
    public void testIsFull() {
        for (int i = 1; i <= squares.length; i++) {
            board.putPiece(new Position(i, 1), Piece.X);
            board.putPiece(new Position(i, 2), Piece.O);
            board.putPiece(new Position(i, 3), Piece.X);
        }
        assertTrue(board.isFull());
    }

    @Test
    public void testGetWinner() {
        Piece pieceWinner = Piece.Null;
        assertEquals("-", pieceWinner.toString());
    }

    @Test
    public void testGetBoard() {
        assertArrayEquals(board.getBoard(), squares);
    }

}
