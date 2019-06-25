import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

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
         * ちなみに、Boolean, Characterクラス以外は、全てNumberクラスのこクラス。
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


    }
}