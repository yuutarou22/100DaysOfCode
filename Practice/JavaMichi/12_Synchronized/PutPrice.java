class PutPrice extends Thread{
    private CalculatePrice cp;
    private int[] price = {100, 200, 300, 400, 500};

    // コンストラクタ内で引数に指定されたオブジェクトcpを代入
    public PutPrice (CalculatePrice cp) {
        this.cp = cp;
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            cp.pricePut(price[i]);
            try {
                // 同期処理っぽく感じるためにSleep（無かったら一瞬で出力される）
                sleep((int)(Math.random()*2000));
            } catch(InterruptedException e) {
            }
        }
    }
}