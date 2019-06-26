import java.util.ArrayList;
import java.util.List;

/**
 * @author Yutaro M
 * @version 0.0.1
 */
public class Board {
    private List<Piece> pieceList;
    private int yNum = 0;
    private int xNum = 0;

    public Board(int xNum, int yNum) {
        this.xNum = xNum;
        this.yNum = yNum;
    }

    /**
     * 盤面の初期化
     */
    public void prepare() {
        this.pieceList = new ArrayList<>();
        for (int y = 0; y < this.yNum; y++) {
            for (int x = 0; x < this.xNum; x++) {
                Piece piece = new Piece(x, y);
                this.pieceList.add(piece);
            }
        }
    }

    /**
     * 盤面のコマを取得する
     * @param x
     * @param y
     * @return Piece
     */
    public Piece getPiece(int y, int x) {
        for (Piece piece : this.pieceList) {
            int[] position = piece.getPosition();
            if (position[0] == y && position[1] == x) return piece;
        }
        return null;
    }

    /**
     * 盤面にコマを置く
     * @param x
     * @param y
     * @param state
     */
    public void putPiece(int x, int y, String state){
        Piece piece = getPiece(x, y);
        piece.setState(state);
    }

    public void feature() {
        String [][] board = new String[yNum][xNum];
        for (Piece piece : this.pieceList) {
            int[] pos = piece.getPosition();
            String state = piece.getState();
            board[pos[1]][pos[0]] = state;
        }

        System.out.println("\n");
        for (int x = 0; x < board.length; x++) System.out.print("\t" + x);
        System.out.println("\n");

        for (int y = 0; y < board.length; y++) {
            System.out.print(y+"\t");
            for (int x = 0; x < board[0].length; x++) {
                String b = board[y][x];
                System.out.print(b+"\t");
            }
            System.out.println("\n");
        }
    }
}