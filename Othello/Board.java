import java.util.ArrayList;
import java.util.List;

/**
 * @author Yutaro M
 * @version 0.0.1
 */
public class Board {
    private List<Stone> StoneList;
    private int yNum = 0;
    private int xNum = 0;

    public Board(int xNum, int yNum) {
        this.xNum = xNum;
        this.yNum = yNum;
    }

    /**
     * 盤面の初期化
     */
    public void initBoard() {
        this.StoneList = new ArrayList<>();
        for (int y = 0; y < this.yNum; y++) {
            for (int x = 0; x < this.xNum; x++) {
                Stone Stone = new Stone(x, y, 2);
                this.StoneList.add(Stone);
            }
        }
        
        for (int y = 1; y < this.yNum-1; y++) {
            for (int x = 1; x < this.xNum-1; x++) {
                Stone stone = getStone(y, x);
                stone.setState(0);
            }
        }
    }

    /**
     * 盤面のコマを取得する
     * @param x
     * @param y
     * @return Stone
     */
    public Stone getStone(int y, int x) {
        for (Stone Stone : this.StoneList) {
            int[] position = Stone.getPosition();
            if (position[0] == y && position[1] == x) return Stone;
        }
        return null;
    }

    /**
     * 盤面にコマを置く
     * @param x
     * @param y
     * @param state
     */
    public void putStone(int x, int y, int state){
        Stone Stone = getStone(x, y);
        Stone.setState(state);
    }

    /**
     * 盤面の表示処理
     */
    public void showBoard() {
        int [][] board = new int[yNum][xNum];
        for (Stone Stone : this.StoneList) {
            int[] pos = Stone.getPosition();
            int state = Stone.getState();
            board[pos[1]][pos[0]] = state;
        }

        System.out.println("\n");
        for (int x = 0; x < board.length; x++) System.out.print("\t" + x);
        System.out.println("\n");

        for (int y = 0; y < board.length; y++) {
            System.out.print(y+"\t");
            for (int x = 0; x < board[0].length; x++) {
                int b = board[y][x];
                System.out.print(b+"\t");
            }
            System.out.println("\n");
        }
    }
}