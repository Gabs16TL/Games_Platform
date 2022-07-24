package game.tictactoe;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;


public class BoardTest {
    Board board = new Board();
    Piece[][] squares = new Piece[3][3];
    Position position;
    Piece piece;
    int EmptySquare;

    @Before
    public void init() {
        position = new Position(1, 1);
        piece = Piece.X;
        board.putPiece(position, piece);
        EmptySquare = 0;
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
        Position p = new Position(2, 2);
        Piece pi = Piece.X;
        assertEquals(board.putPiece(position, piece), b.putPiece(p, pi));
    }

    @Test
    public void testIsFull() {
        assertTrue(EmptySquare <= 0);
    }

    @Test
    public void testGetWinner() {
        Piece pieceWinner = Piece.Null;
        assertEquals("-", pieceWinner.toString());
    }

    @Test
    public void testGetBoard() {
        Assert.assertEquals(board.getBoard(), squares);
    }

}
