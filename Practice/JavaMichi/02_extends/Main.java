class Main {
    public static void main(String[] args) {
        BollpointPen bollpointPen = new BollpointPen();
        ThreeBollpointPen threeBollpointPen = new ThreeBollpointPen();
        bollpointPen.exShow(); // スーパクラスのメソッド
        threeBollpointPen.exShow(); // サブクラスからスーパクラスのメソッドを呼び出す
        threeBollpointPen.exThreeShow(); // サブクラスのメソッド
    }
}