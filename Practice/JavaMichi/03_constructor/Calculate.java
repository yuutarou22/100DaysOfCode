class Calculate {
    private int money;

    /**
     * クラスメイト同じメソッドがコンストラクタになる
     * コンストラクタを定義していない場合、デフォルトコンストラクタがコンパイル時に自動生成される。
     * public :全てのクラスでコンストラクタを実行できる
     * private :クラス内でしかコンストラクタを実行できない（シングルトンとかで使う）
     * なし :クラス内、パッケージ内でのみコンストラクタを実行できる
     * protected :コンストラクタを宣言したサブクラスと、同一パッケージ内でのみ実行可能
     */ 
    
    // コンストラクタは複数宣言もできる.引数で判断している。
    public Calculate() {
        this.money = 0;
    }

    public Calculate(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    public void needMoney() {
        System.out.println("5000兆円欲しい！");
    }
}