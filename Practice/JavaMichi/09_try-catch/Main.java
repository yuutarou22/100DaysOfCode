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
        ExExecption3(0); // finally
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

    public static void ExExecption3(int num) {
        try {
            // 例外をスローする可能性のある処理を書く
            System.out.println("答えは " + (100 / num));
        } catch (ArithmeticException e) {
            // スローされた例外に対する処理を例外ハンドラ(ここ)に書く
            System.err.println("エラー" + e.getMessage());
        } catch (IOEception e) {
            // catchはif文と同じで、それ以降のcatchは実行しない。
            // 例外クラスの継承関係を意識して、「具体的な」例外ハンドラから書く。
            System.out.println("エラー" + e.getMessage());
        } finally {
            // 最後に必ず実行される処理
            System.out.println("Finished");
        }
    }

    /**
     * 例外オブジェクトは、クラスによって管理されている。
     * 全ての例外クラスは「Throwable」クラスの子孫クラス。
     * 
     * 例外関連のクラスは大きく分けて以下のような3つに分類される。
     * 
     * Throwable
     * 　　　　┝ Error
     * 　　　　┗ Exception
     * 　　　　　　　┗ RuntimeException
     * 　　　　　　　　　　　　　　　　┝ NullPointerException
     * 　　　　　　　　　　　　　　　　┝ ArithmeticException
     * 　　　　　　　　　　　　　　　　：
     */
}