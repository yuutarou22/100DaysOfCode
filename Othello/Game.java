import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    static final int BOARD_SIZE = 8;
    static final int MAX_STONES = BOARD_SIZE * 2;
    static Scanner scan = new Scanner(System.in);
    static Board board = new Board(BOARD_SIZE + 2); // 上下左右の壁の分で2を加算
    public static void main(String[] args) {
        Player playerBk = new Player(1, true, 2);
        Player playerWt = new Player(-1, false, 2);

        board.initBoard();
        board.initPutStone();
        board.showBoard();

        // 石を置く場所の入力
        while (playerBk.getStones() + playerWt.getStones() != MAX_STONES){
            inputStonePosition(playerBk, playerWt);
            board.showBoard();
        }
    }

    /**
     * 石を置く場所の入力
     */
    public static void inputStonePosition(Player playerBk, Player playerWt) {
        int inputX = -1;
        int inputY = -1;

        System.out.println("石を置く\"X\"座標を入力ください(例:4)");
        try {
            inputX = scan.nextInt(); // TODO: hasNextInt()
        } catch (Exception e) {
            System.out.println("不正な値でした");
        }

        System.out.println("石を置く\"Y\"座標を入力ください(例:3)");
        try {
            inputY = scan.nextInt();            
        } catch (Exception e) {
            // TODO: X座標を「fdsaf」とか入力するとY座標も不正値になる
            System.out.println("不正な値でした");
        }

        // 置けるかどうか判定
        if (judge(inputX, inputY)) {
            if (playerBk.getTurn()) {
                board.putStone(inputX, inputY, playerBk.getHaveStone());
                playerBk.setTurn(false);
                playerWt.setTurn(true);
            } else {
                board.putStone(inputX, inputY, playerWt.getHaveStone());
                playerBk.setTurn(true);
                playerWt.setTurn(false);
            }
            
        } else {
            System.out.println("指定された場所には置けません。");
        }
    }

    /**
     * 
     * @param inputX
     * @param inputY
     * @return 判定結果（true: 置ける、false: 置けない）
     */
    public static boolean judge(int inputX, int inputY) {
        if ((board.getStone(inputX, inputY)).getState() == 0) {
            // ToDo: 周囲に自石と異なる石があり、1つでも反転できる場合のみ。
            return true;
        } else {
            return false;
        }
    }
}