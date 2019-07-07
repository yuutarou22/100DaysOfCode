class Main {
    /**
     * スレッドとは、一つのプログラム上で動作する特定の処理のことを指す。
     * 一つのプログラム上でいくつもの処理を「同時に実行させているかのように見せたい」時に使う。
     * 上記のようなプログラムを「マルチスレッドプログラム」と呼ぶ（ブラウザとかそうだね）
     */

    /**
     * スレッドは複数の処理を同時に動作させているように見せているだけで、
     * 複数の処理をあるスケジュールを元に実行し、
     * 複数の処理が同時に実行されているようにしている仕組み。
     * 
     * スケジュールは、それぞれのスレッドが持つ優先度によって決定される。
     * Javaの優先度は「プリエンプティブ型:preempt(取って代わる)」と呼ばれる。
     * 現在実行しているスレッドより高い優先度のスレッドが実行された場合は、取って代わる。
     * しかし逆に、低い優先度のスレッドの場合は、スレッドが最後まで実行されるか、
     * 実行不可状態になるまえ現在実行しているスレッドを実行し続ける。というもの。
     */

    public static void main(String[] args) {
        ExThread thread1 = new ExThread();
        ExThread thread2 = new ExThread();

        thread1.start();
        thread2.start();

        // 1. スレッドの作成
        ThreadLifeSycle lifeSycle = new ThreadLifeSycle();
        // 2. 実行可能状態へ移行
        lifeSycle.start();


        // Runnableを使った実装
        // 1. それぞれのクラスのオブジェクトを生成
        showName sn = new showName();
        showFurigana sf = new showFurigana();
        // 2. Threadクラスのオブジェクトを生成
        Thread snThread = new Thread(sn);
        Thread sfThread = new Thread(sf);
        // 3. スレッドを実行可能状態にする
        snThread.start();
        sfThread.start();

        /**
         * Threadクラスの継承、Runnableインタフェースの実装使い分け
         * スレッドを実装したいクラスが、Threadクラス以外のクラスを継承する必要がある場合は、
         * Runnableインタフェースを実装する
         * 理由クラスの多重継承は認められておらず、インタフェースは複数の実装が可能なため。
         */
    }
}