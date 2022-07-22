package game.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class BoardTest {
    Board board = new Board();
    Piece[][] squares = new Piece[3][3];
    Position position;
    Piece piece;

    @Before
    public void init() {
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
        Position p = new Position(2, 2);
        Piece pi = Piece.X;
        assertEquals(board.putPiece(position, piece), b.putPiece(p, pi));
    }

    @Test
    public void testIsFull() {
    }

    @Test
    public void testGetWinner() {
    }

    @Test
    public void testGetBoard() {
    }
}
