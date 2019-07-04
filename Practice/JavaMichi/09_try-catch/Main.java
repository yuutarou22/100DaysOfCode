class Main {
    /**
     * 【例外とは】
     * 予期せぬ事象（エラー）のことを指す。
     * この例外が起きた時、Javaは予め用意されているエラーメッセージを表示し、
     * プログラムを終了する。（よく見るExceptionね）
     * 上記は、Javaデフォルトの例外処理だが、これ以外に任意の例外処理を追加できる。
     * Javaすごい。
     * 
     * 【キーワード】
     * 　・例外（オブジェクト）
     * 　　　エラー情報を保有したオブジェクトのこと
     * 
     * 　・例外をスローする
     * 　　　例外時、例外オブジェクトを生成し、Java実行システムに渡すこと。
     * 
     * 　・例外ハンドラ
     * 　　　エラーメールの送信、エラーログの生成など、
     * 　　　例外処理が「記述された部分」のこと。
     * 
     * 　・例外をキャッチする
     * 　　　Java実行システムが例外ハンドラを見つけること
     */

    public static void main(String[] args) {
        //  ExException1(); // デフォルトの例外
        ExException2(); // 例外ハンドラ
    }

    public static void ExException1() {
         int x = 10 / 0; // 0除算はエラーになる。
    }

    public static void ExException2() {
        try {
            // 例外オブジェクトが生成され、スローされる
            int x = 10 / 0;
        } catch(ArithmeticException e) {
            // 該当する例外ハンドラを見つけたら（例外のキャッチ）、その例外ハンドラを実行する。
            System.out.println("0で除算できません");
        }
    }
}