import java.util.*;

class Main {
    /**
     * 参考　http://www.javaroad.jp/java_collection1.htm
     * 「コレクション」とは、複数の要素の集まりを指す。
     * 「コレクションフレームワーク」とは、
     * その要素の集まりを操作・管理するための方法を定義したアーキテクチャ
     * ・Collectionインタフェース
     * 　　　　List、Setインタフェースの親。
     * ・Listインタフェース
     * 　　　　格納される要素において、順番を持つインタフェース。
     * 　　　　インデックス番号によって要素を操作するメソッドが定義されている。
     * ・Setインタフェース
     * 　　　　格納されている要素において、重複を許可しないインタフェース。
     * ・SortedSetインタフェース
     * 　　　　Setインタフェースを継承する。
     * 　　　　Setの特性に加え、要素をルールに基づきソートするというメソッドが定義されている。
     * ・Mapインタフェース
     * 　　　　格納される要素において、順番を持つインタフェース。
     * 　　　　インデックス番号によって、要素を操作するメソッドが定義されている。
     * ・SortedMapインタフェース
     * 　　　　Mapインタフェースを継承する。
     * 　　　　Mapの特性に加え、キーをルールに基づきソートする
     * 
     * 上記のこれらのインタフェースを実装したクラスが、普段使われる。
     * よく使う ArrayList は、Listインタフェースを実装している。
     * 
     * 以下では、List, Set, Map のインタフェースの特性を実際に用いる。
     */
    public static void main(String[] args) {
        ExCollectionList();
        ExCollectionSet();
        // ExCollectionMap();
    }

    public static void ExCollectionList() {
        /**
         * Listインタフェースは、重複要素を許可し、要素において順番を持つ。
         * インデックス番号によって要素にアクセスするメソッドや、
         * 要素のインデックス番号を調べるメソッドを持っている。
         * Listインタフェースを実装するクラス
         *      ・ArrayList
         *          ランダムアクセスをサポートしており、要素の検索において高速。
         *          要素の追加・削除は、要素の再配置を行うため低速。
         *          ただし、要素の操作を行う際同期化されてない分
         *          Vectorクラス（もともと使われていたクラス）より高速。
         * 
         *      ・LinkedList
         *          要素の順番を各要素の前後のリンク情報を持つ事で保持する。
         *          要素の追加・削除は、リンク情報を操作するだけなので高速。
         *          要素の検索は、順番にアクセスしていくため低速。
         */
        long start, stop;

        ArrayList<Integer> arrayListHead = new ArrayList<Integer>();
        LinkedList<Integer> linkedListHead = new LinkedList<Integer>();
        ArrayList<Integer> arrayListEnd = new ArrayList<Integer>();
        LinkedList<Integer> linkedListEnd = new LinkedList<Integer>();

        System.out.println("============ListTest============");
        // ArrayList 先頭追加
        start = System.currentTimeMillis(); // 現在時刻取得
        addhead(arrayListHead);
        stop = System.currentTimeMillis(); // 現在時刻取得
        System.out.println("ArrayListの先頭追加処理：" + (stop-start));

        // LinkedList　先頭追加
        start = System.currentTimeMillis(); // 現在時刻取得
        addhead(linkedListHead);
        stop = System.currentTimeMillis(); // 現在時刻取得
        System.out.println("LinkedListの先頭追加処理：" + (stop-start));

        // ArrayList 最後追加
        start = System.currentTimeMillis(); // 現在時刻取得
        addend(arrayListEnd);
        stop = System.currentTimeMillis(); // 現在時刻取得
        System.out.println("\nArrayListの最後追加処理：" + (stop-start));

        // LinkedList　最後追加
        start = System.currentTimeMillis(); // 現在時刻取得
        addend(linkedListEnd);
        stop = System.currentTimeMillis(); // 現在時刻取得
        System.out.println("LinkedListの最後追加処理：" + (stop-start));

        // ArrayList　検索
        start = System.currentTimeMillis(); // 現在時刻取得
        select(arrayListHead);
        stop = System.currentTimeMillis(); // 現在時刻取得
        System.out.println("\nArrayListの検索処理：" + (stop-start));

        // LinkedList 検索
        start = System.currentTimeMillis(); // 現在時刻取得
        select(linkedListHead);
        stop = System.currentTimeMillis(); // 現在時刻取得
        System.out.println("LinkedListの検索追加処理：" + (stop-start));
    }

    public static void addhead(List exList) {
        for(int i = 0; i < 10000; i++) {
            exList.add(0, new Integer(i));
        }
    }

    public static void addend(List exList) {
        for(int i = 0; i < 10000; i++) {
            exList.add(new Integer(i));
        }
    }

    public static void select(List exList) {
        for(int i = 0; i < exList.size(); i++) {
            exList.get(i);
        }
    }

    public static void ExCollectionSet() {
        /**
         * Setインタフェースは、重複要素を持たないオブジェクトの集合を実装する。
         * Setインタフェースを実装するクラス
         *      ・HashSetクラス
         *              Setインタフェースを実装した基本となるクラス。
         *              保持する要素に重複要素は無い。
         *              保持する要素の順序を保証しない。
         *              Setインタフェースを実装したクラスの中で最も高速。
         *      ・TreeSetクラス
         *              保持する要素に重複要素は無い。
         *              保持する要素は自然順序、もしくはコンストラクタのComparatorに従い昇順にソートされる。
         *      ・LinkedHashSetクラス
         *              保持する要素に重複要素は無い。
         *              保持する要素の挿入される挿入順を保持する。
         */

        System.out.println("============SetTest============");
        showFeature(new HashSet(), "HashSet");
        showFeature(new TreeSet(), "TreeSet");
        showFeature(new LinkedHashSet(), "LinkedHashSet");

        Set treeSet = new TreeSet();

        Set treeSet1 = new TreeSet();
        for (int i = 1; i < 4; i++) {
            treeSet1.add(new Integer(i));
        }

        Set treeSet2 = new TreeSet();
        for (int i = 1; i < 4; i++) {
            treeSet2.add(new Integer(i*11));
        }

        treeSet.addAll(treeSet1);
        System.out.println("\ntreeSet1を追加: " + treeSet);

        treeSet.addAll(treeSet2);
        System.out.println("treeSet2を追加: " + treeSet);

        treeSet.retainAll(treeSet1);
        System.out.println("treeSet1のみ保持: " + treeSet);

        if (treeSet.containsAll(treeSet1)) { // treeSet1の要素が全てtreeSetにあるか判定
            treeSet.addAll(treeSet2);
        }
        System.out.println("treeSet2を追加: " + treeSet);
    }

    public static void showFeature(Set exSet, String setType) {
        int[] intArray = {5, 8, 2, 9, 1};
        for(int num : intArray) {
            exSet.add(new Integer(num));
        }
        // exSet.clear();
        System.out.println(setType + " : " + exSet/*.toArray()*/);
    }
}