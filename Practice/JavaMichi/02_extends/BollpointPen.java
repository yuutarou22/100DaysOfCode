class BollpointPen {

    // クラス全体のスコープにいる変数は、フィールド（メンバ）変数と呼ぶ
    int fieldValue = 10;

    void exShow() {
        // メソッド内の変数を、ローカル変数と呼ぶ
        String localValue = "これは";
        System.out.println(localValue + "ボールペンです。");
    }
}