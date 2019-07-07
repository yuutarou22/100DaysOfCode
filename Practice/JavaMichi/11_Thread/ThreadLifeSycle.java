class ThreadLifeSycle extends Thread {
    // 3. スレッドの実行
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ":" + i);
            try {
                // 4-1. sleep状態へ移行
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    } // 5. スレッドの終了
}