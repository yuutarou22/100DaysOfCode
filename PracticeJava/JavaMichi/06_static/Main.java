class Main {
    public static void main(String[] args) {
        ExClassStatic ins1 = new ExClassStatic();
        ins1.setSize(10);
        System.out.println(ins1.getSize());

        ExClassStatic ins2 = new ExClassStatic();
        ins2.setSize(20);
        System.out.println(ins1.getSize()); // staticなのでins1を参照してgetしても20が取得される。
    }
}