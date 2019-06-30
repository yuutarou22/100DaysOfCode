class Calculate02 extends Calculate {
    private int height;

    public Calculate02(int money) {
        super(money);
        this.height = 160;
    }

    public Calculate02() {
        // 共通の処理(ここで言うならthis.height = 160)を
        // コンストラクタで実行したい場合は、thisを使う。
        // ここでも引数でどのコンストラクタを実行するか判定する。
        // ※メソッドの１文目で実行する必要がある。
        this(500);
    }
}