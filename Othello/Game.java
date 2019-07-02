public class Game {
    public static void main(String[] args) {
        Board board = new Board(10,10);
        board.initBoard();
        board.putStone(4, 4, 1);
        board.putStone(5, 5, 1);
        board.putStone(4, 5, -1);
        board.putStone(5, 4, -1);
        board.showBoard();
    }
}