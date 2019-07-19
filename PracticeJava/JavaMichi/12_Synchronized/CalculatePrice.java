class CalculatePrice {
    private int workArea;
    private boolean available = false;

    // pricePutメソッドが終了するまで、メソッドが属するオブジェクトは実行されない
    public synchronized void pricePut(int price) {
        while (available == true) {
            try {
                wait(); // availableがTrueの間 wait();
            } catch(InterruptedException e) {
            }
        }
        workArea = price;
        available = true;
        // availableにTrueを代入後、wait状態のスレッドを解除
        notifyAll();
    }
    
    // priceGetメソッドが終了するまで、メソッドが属するオブジェクトは実行されない
    public synchronized void priceGet() {
        while (available == false) {
            try {
                wait(); // availableがFalseの間 wait();
            } catch(InterruptedException e) {
            }
        }
        // workAreaから値を抜き出す処理
        System.out.println("課税後価格は" + workArea * 1.08 + "円です");
        available = false;
        // availableにFalseを代入後、wait状態のスレッドを解除
        notifyAll();
    }
}