import java.util.ArrayList;
import java.util.List;

/**
 * @author Yutaro M
 * @version 0.0.1
 */
public class Board {
    private List<Stone> StoneList;
    private int mHeightSize = 0;
    private int mWidthSize = 0;

    /**
     * コンストラクタ
     * 正方形でない盤面でも対応
     * 
     * @param widthSize 横サイズ
     * @param heightSize 縦サイズ
     */
    public Board(int widthSize, int heightSize) {
        this.mWidthSize = widthSize;
        this.mHeightSize = heightSize;
    }
    
    /**
     * コンストラクタ
     * 引数が一つだった場合、自動的に正方形を生成する
     * @param size サイズ
     */
    public Board(int size) {
        this(size, size);
    }

    /**
     * 盤面の初期化
     */
    public void initBoard() {
        this.StoneList = new ArrayList<>();
        for (int y = 0; y < this.mHeightSize; y++) {
            for (int x = 0; x < this.mWidthSize; x++) {
                Stone Stone = new Stone(x, y, 2);
                this.StoneList.add(Stone);
            }
        }
        
        for (int y = 1; y < this.mHeightSize-1; y++) {
            for (int x = 1; x < this.mWidthSize-1; x++) {
                Stone stone = getStone(x, y);
                stone.setState(0);
            }
        }
    }

    /**
     * 盤面の初期配置
     */
    public void initPutStone() {
        putStone(4, 4, 1);
        putStone(5, 5, 1);
        putStone(4, 5, -1);
        putStone(5, 4, -1);
    }

    /**
     * 盤面のコマを取得する
     * @param x 石の横位置
     * @param y 石の縦位置
     * @return Stone 指定場所の石情報
     */
    public Stone getStone(int x, int y) {
        for (Stone Stone : this.StoneList) {
            int[] position = Stone.getPosition();
            if (position[0] == x && position[1] == y) return Stone;
        }
        return null;
    }

    /**
     * 盤面にコマを置く
     * @param x 石の横位置
     * @param y 石の縦位置
     * @param state 指定場所の石情報
     */
    public void putStone(int x, int y, int state){
        Stone Stone = getStone(x, y);
        Stone.setState(state);
    }

    /**
     * 盤面の表示処理
     */
    public void showBoard() {
        int [][] board = new int[mHeightSize][mWidthSize];
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