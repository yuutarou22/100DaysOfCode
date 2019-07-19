class Main {
    /**
     * ジェネリクスとは、Integer、Stringなどの様々な型に対応する
     * 汎用的なクラスやメソッドを作る機能のこと。
     * ->データ型そのものを変数として扱えるようなクラス作成が可能。
     * 使わないと、データ型の不一致で実行時エラーが発生する場合がある。
     */
    
    public static void main(String[] args) {
        // インスタンス生成時、使用する型を指定
        Shelf<Integer> ins1 = new Shelf<Integer>();
        ins1.setValue(123);
        Integer i = ins1.getValue();
        System.out.println(i);
    }
}