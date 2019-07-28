/**
 * @author Yutaro M
 * @version 0.0.1
 */
public class Player {
    int mHaveStone;
    boolean mTurn;
    int mStones;

   public Player(int _HaveStone, boolean _Turn, int _Stone) {
        mHaveStone = _HaveStone;
        mTurn = _Turn;
        mStones = _Stone;
   }

   public void setHaveStone(int haveStone) {
       mHaveStone = haveStone;
   }

   public int getHaveStone() {
       return mHaveStone;
   }

   public void setTurn(boolean turn) {
       mTurn = turn;
   }

   public boolean getTurn() {
       return mTurn;
   }

   public void setStones(int stones) {
       mStones = stones;
   }

   public int getStones() {
       return mStones;
   }
}