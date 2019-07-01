class ExClassB extends ExClassA {
    /**
     * オーバライドするときの注意点
     * ・オーバライドする際、スーパクラスのメソッドと引数の数や型は全て同一。
     * ・オーバライドされるメソッドのアクセススコープよりも狭いスコープでオーバライドできない。
     * 　　例：protected→private
     * ・オーバライドされるメソッドにfinal修飾子がついている場合、オーバライドできない。
     * ・オーバライドされるメソッドに指定されているthrow以外の例外処理を
     * 　オーバライドするメソッドで定義できない（一応できる手段はある）
     * ・オーバライドされるメソッドにabstract修飾子がついている場合、
     * 　サブクラスでオーバライドして定義する必要がある。
     * 　定義しない場合、そのサブクラスはabstractクラスになる。
     */
    @Override
    public int calcurate(int val) {
        return val * 10000;
    }

    /**
     * オーバロードについて
     * メソッド名が同一で、引数が異なるメソッドを複数定義すること。
     * 引数が異なるメソッドと判定される基準は、引数の「型」、「数」、「並び順」
     * 以下の箇所が異なっても、異なるメソッドとは呼べずコンパイルエラーを引き起こす
     * 　・戻り値型
     * 　・アクセスレベル
     * 　・引数名
     * 　・throws節
     */
    public int calcurate(int val1, int val2) {
        return val1 * val2;
    }
    
    public int calcurate(int val1, int val2, int val3) {
        return val1 * val2 * val3;
    }
}