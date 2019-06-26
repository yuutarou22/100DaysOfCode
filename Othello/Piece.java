/**
 * @author Yutaro M
 * @version 0.0.1
 */
public class Piece {
    /**
     * 白黒コマのクラス
     */
    private String state; // 黒...B, 白...W, 空...E
    private int x;
    private int y;

    public Piece(int x, int y) {
        this.state = "E";
        this.x = x;
        this.y = y;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int[] getPosition() {
        int[] position = {this.x, this.y};
        return position;
    }
}