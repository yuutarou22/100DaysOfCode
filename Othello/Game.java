public class Game {
    public static void main(String[] args) {
        Board board = new Board(6,6);
        board.prepare();
        board.putPiece(2, 2, "B");
        board.putPiece(3, 3, "B");
        board.putPiece(2, 3, "W");
        board.putPiece(3, 2, "W");
        board.feature();
    }
}