/**
 * synchronizedは、メソッド、ブロックに対して指定する。
 * synchronizedが指定されると、指定されたメソッド・ブロックが属するオブジェクトは
 * メソッド・ブロックを実行している間、同じオブジェクト内のsynchronizedが指定された
 * メソッド・ブロックからアクセスされないようロックされる。
 * 
 * オブジェクトを共有するメソッド・ブロックを「クリティカルセクション」と呼ぶ。
 * synchronizedは、クリティカルセクションに指定する。
 */


/**
 * 【処理の流れ】
 * 1. CalculatePriceオブジェクトが生成される。
 * 　　Synchronized指定のputPrice、getPriceメソッドを持っている。
 * 2. Threadを継承したPutPrice、GetPrice
 * 　　それぞれにCalculatePriceを引数として渡す。
 * 3. PutPrice（pp）から処理が始まる。
 * 4. ppインスタンス > CalculatePrice.pricePutを呼び出す
 * 5. availableは falseなので共通変数の workAreaに代入。
 * 　　そしてavailableは trueにする。
 * 　　この間、下記 5' は実行できない。
 * 5'. この間実行を待っていたgpインスタンス > CalculatePrice.priceGetを呼び出す。
 * 　　availableは trueなので共通変数の workAreaを使い計算・出力する。
 * 　　そしてavailableは falseにする。
 * 6. 5 と 5' の繰り返し。排他的に処理を繰り返す。
 */
class Main {
    public static void main(String[] args) {
        CalculatePrice cp = new CalculatePrice();
        PutPrice pp = new PutPrice(cp);
        GetPrice gp = new GetPrice(cp);
        
        pp.start();
        gp.start();

        TestSynchronized();
    }
}