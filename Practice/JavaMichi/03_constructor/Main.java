class Main {
    public static void main(String[] args) {
        Calculate calculate1 = new Calculate(100);
        System.out.println(calculate1.getMoney() + "円持っています");
        calculate1.needMoney();

        Calculate calculate2 = new Calculate();
        System.out.println(calculate2.getMoney() + "円持っています");
        calculate2.needMoney();

        Calculate02 calculate02 = new Calculate02();
        System.out.println(calculate02.getMoney() + "円持っています");
    }
}