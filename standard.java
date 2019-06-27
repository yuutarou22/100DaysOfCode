class standard {
    public static void main(String args[]) {
        /**
         * Javaにおける変数の型は大きく 2種類存在する。
         * プリミティブ型　ー　データそのものを表し、振る舞いを持たない。
         * 参照型　　　　　ー　プリミティブ型配列も参照型に分類される。
         * 　　　　　　　　　　（クラス、インタフェース、配列）
         * 　　　　　　　　　　変数にはオブジェクトを指す「参照」が格納される。
         * 　　　　　　　　　　そのため、引数は参照渡し。
         * 　　　　　　　　　　全ての参照型は java.lang.Object クラスから派生している。
         */

        /* プリミティブ型 */
        // 整数型
        byte tmpByte = 10;
        short tmpShort = 10;
        int tmpInt = 10;
        long tmpLong = 10;
        // 文字型
        char tmpChar = 'a';
        // 浮動小数点数
        float tmpFloat = 3.5f;
        double tmpDouble = 3.5;
        // 真偽値
        boolean tmpBoolean = true;

        /* 参照型 */
        int tmpIntArray[] = new int[]{1,2,3,4};
        String tmpString = "あいうえお";

        /**
         * プリミティブ型の変数でも参照型のように扱いたい時は、
         * ラッパークラスを用いる。
         * ちなみに、Boolean, Characterクラス以外は、全てNumberクラスのサブクラス。
         * */
        tmpByte = Byte.MAX_VALUE;
        tmpShort = Short.MAX_VALUE;
        tmpInt = Integer.MAX_VALUE;
        tmpLong = Long.MAX_VALUE;
        tmpChar = Character.MAX_HIGH_SURROGATE;
        tmpFloat = Float.MAX_VALUE;
        tmpDouble = Double.MAX_VALUE;
        tmpBoolean = Boolean.getBoolean(tmpString);



        /**
         * 演算子たち。
         * 基本的な四則演算子等は省略する。
         * 
         * ◆　?:
         *      op1 ? op2 : op3
         *          op1が真の場合 op2、偽の場合 op3が戻り値となる。
         * ◆　[]
         *      type []
         *          長さ未定の配列を定義
         *      type [op1]
         *          長さ[op1]の配列を作成する。
         *          new もつき始める。
         * 
         *      op1 [op2]
         *          op2 の配列の長さでop1を定義
         * ◆　"."
         *      op1.op2
         *          オブジェクトop1（オブジェクト）のop2を参照する。
         * ◆　()
         *      op1(params)
         *          パラメータparamsを持ったオブジェクトop1。
         * ◆　(type)
         *      (type) op1
         *          op1 をtypeにキャストする
         * ◆　new
         *      new op1
         *          op1をインスタンス生成する
         * ◆　instanceof
         *      op1 instanceof op2
         *          op1がop2と同じインスタンスであればTrueを返す
         */
        // ?: 三項演算子
        System.out.println(tmpBoolean ? "True" : "False");

        // [] 長さが決まっていない配列を定義
        String[] tmpStrings = {"あいう", "かきく", "さしす"};

        // [] 長さが決まった配列を定義
        int StrArrayInt = 3;
        String[] tmpStrings2 = new String[StrArrayInt];

        // "." 以下ではオブジェクトのメソッドを参照
        System.out.println(tmpString.length());

        // "instanceof" オブジェクトの型を判定
        System.out.println(tmpString instanceof String ? "String" : "Not String");



        /**
         * プログラムの単位として、おおざっぱに
         * 　　式 < 文 < ブロック
         * で構成されている。
         * 
         * 式：単一の計算するための変数、演算子、メソッド呼び出しを含む系列。
         * 文：実行の最小単位となるもの。文の最後は「;」がつく。
         * ブロック：文をいくつかまとめたもの。{文1; 文2;...} のように中かっこで囲む
         * 
         */

        // 課題
        int i = 10;
        System.out.println(i-- % 5 > 0);

        double xValue = 12.345, yValue = 54.321, work;
        System.out.println("befor: xValue and yValue = " + xValue + ", " + yValue);
        work = xValue;
        xValue = yValue;
        yValue = work;
        System.out.println("after: xValue and yValue = " + xValue + ", " + yValue);



        /**
         * コントロール文
         * 実行順序を改変する文のこと。
         * 繰り返し：while, do-while, for
         * 決定　　：if-else, switch-case
         * 分岐　　：break, continue, label:, return
         */


        // while
        tmpInt = 10;
        while (tmpInt > 0) {
            System.out.println("tmpInt= " + tmpInt--);
        }

        // do-while(３乗と２乗の差が200より大きい最小の整数を求める)
        int x = 1;
        do {
            x++;
        } while (Math.pow(x, 3) - Math.pow(x, 2) <= 200);
        System.out.println("x = " + x);

        // for(triangle01)
        for (int j = 1; j <= 10; j++) {
            for (int k=0; k < j; k ++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        // for(triangle02=対照的な三角形も作ろう)



        /**
         * 配列
         * 一つの変数名の元で多数の値を保持できる。
         */
        // 初期値を伴う配列定義
        int intArray[] = {0, 1, 2, 3, 4, 5};
        // 初期値のない配列を定義
        double doubleArray[] = new double[5];
        char charArray[];
        charArray = new char[5];


        // 課題
        int resultData[] = {32,73,25,57,34,90,68,83,45,76};
        int sum = 0;
        for (int j = 0; j < resultData.length; j++) {
            sum += resultData[j];
        }
        System.out.println("average = " + sum / resultData.length);



        /**
         * 文字データを扱うクラス
         * ...にはCharacter, String, StringBufferがある。
         * クラスメソッドは、インスタンス生成しなくても使えるメソッド（予めあるもの）
         * インスタンスメソッドは、インスタンスを生成しないと使えないメソッド（独自実装したメソッド等）
         */
        Character tmpCharacter = new Character('a');
        System.out.println("toUpperCase = " + Character.toUpperCase(tmpCharacter));
        System.out.println("toLowerCase = " + Character.toLowerCase(tmpCharacter));

        String tmpString2 = "tmpString";
        System.out.println("length = " + tmpString2.length());
        System.out.println("tmpString2.charAt(3) = " + tmpString2.charAt(3));
        System.out.println("tmpString2.toUpperCase() = " + tmpString2.toUpperCase());
        System.out.println("tmpString2.toLowerCase() = " + tmpString2.toLowerCase());
        System.out.println("tmpString2.substring(4) = " + tmpString2.substring(4));
        System.out.println("tmpString2.replace(\"tmp\", \"テンプレート\") = " + tmpString2.replace("tmp", "テンプレート"));



        /**
         * 数値クラス
         * 先述にもあるが、Numberクラスをスーパークラスとし、
         * そのサブクラスに8つの数値クラスがある。
         * Byte, Short, Integer, Long, Float, Double, BigInteger, BigDecimal
         */
        Integer integer1 = new Integer(20);
        Integer integer2 = new Integer(20);
        Long long1 = new Long(20);
        System.out.println((integer1.equals(integer2) ? "Equal" : "Different"));
        System.out.println((integer1.equals(long1) ? "Equal" : "Different"));
        System.out.println(Integer.valueOf(integer1));
    }
}