class Main {
    /**
     * 【継承の注意点】
     * ・Javaでは継承は1つのみ。2つ以上のスーパクラスを持つことはない
     * ・スーパクラスでprivate修飾子で宣言しているメンバ変数、メソッドは参照できない
     * ・修飾子がない場合は、同じパッケージ内であればサブクラスから参照できる
     * ・final修飾子で宣言されたスーパクラスは継承できない
     * ・スーパクラスのコンストラクタはサブクラスに継承されない
     * 　ー＞サブクラス側でコンストラクタを再定義する
     * 　ー＞スーパクラスのコンストラクタを呼び出す
     */
    public static void main(String[] args) {
        BollpointPen bollpointPen = new BollpointPen();
        ThreeBollpointPen threeBollpointPen = new ThreeBollpointPen();
        bollpointPen.exShow(); // スーパクラスのメソッド
        threeBollpointPen.exShow(); // サブクラスからスーパクラスのメソッドを呼び出す
        threeBollpointPen.exThreeShow(); // サブクラスのメソッド

        /**
         * インスタンスとメモリの流れ
         */
        // 1, インスタンスの参照用変数がメモリに確保される。
        BollpointPen bollpointPen2;
        // 2, インスタンスの生成（new）がされると、実際にオブジェクトの領域がメモリに確保される。
        // 以下では、生成と初期化（コンストラクタ）が実行される。
        bollpointPen2 = new BollpointPen();

        /**
         * ガーベジコレクションについて
         * Javaではガーベジコレクション（生ゴミの収集）という、未使用のインスタンス領域を解放する機能がある。
         * メモリ領域の管理は、言語によってはプログラマ自らが行わなければならない。
         * Javaに関しては、変数やインスタンス領域はメソッドが終了すると解放される。
         * 意図的にJVMに未使用のインスタンス領域を通知する際は「null」を代入する。
         */
    }
}