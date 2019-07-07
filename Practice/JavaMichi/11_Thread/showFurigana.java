class showFurigana implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("名前：Java太郎");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}