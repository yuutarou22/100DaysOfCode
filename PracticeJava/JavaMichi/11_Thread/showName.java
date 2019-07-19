/**
 * Runnableインタフェースには、run()メソッドのみしか無い。
 * その本体をクラスで実装する。
 * このクラスで生成したオブジェクトを、Threadクラスの引数(Runnable)に使う。
 */

class showName implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("ふりがな：javaたろう");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}