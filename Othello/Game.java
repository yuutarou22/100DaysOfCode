import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static Board board = new Board(10,10);
    public static void main(String[] args) {
        board.initBoard();
        initPutStone();
        board.showBoard();

        // 石を置く場所の入力
        while (true) {
            inputStonePosition();
            board.showBoard();
        }
    }

    /**
     * 石の初期配置処理
     */
    public static void initPutStone() {
        board.putStone(4, 4, 1);
        board.putStone(5, 5, 1);
        board.putStone(4, 5, -1);
        board.putStone(5, 4, -1);
    }

    /**
     * 石を置く場所の入力
     */
    public static void inputStonePosition() {
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
            // X座標を「fdsaf」とか入力するとY座標も不正値になる
            System.out.println("不正な値でした");
        }

        System.out.println("inputX: " + inputX);
        System.out.println("inputY: " + inputY);

        board.putStone(inputX, inputY, 1);
    }
}