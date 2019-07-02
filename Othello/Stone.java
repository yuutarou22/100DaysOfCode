/**
 * @author Yutaro M
 * @version 0.0.1
 */
public class Stone {
    /**
     * オセロの石のクラス
     */
    private int state; // 黒...1, 白...-1, 空...0, 壁...2
    private int x;
    private int y;

    public Stone(int x, int y) {
        this.state = 0;
        this.x = x;
        this.y = y;
    }

    public Stone(int x, int y, int state) {
        this.state = state;
        this.x = x;
        this.y = y;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int[] getPosition() {
        int[] position = {this.x, this.y};
        return position;
    }
}