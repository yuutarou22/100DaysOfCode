class Main {

    public static void main(String[] args) {
        // publicはどこからでもアクセスできる。
        ExAccessA insA = new ExAccessA();
        System.out.println(insA.exPublic);

        // privateのものはゲッターを使って取得する。ゲッターは定義する必要がある。
        // System.out.println(insA.exPrivate);←NG
        System.out.println(insA.getExPrivate());

        // protectedは同一クラス・パッケージ、サブクラスから参照できる。
        // ※注意が必要で、protectedの場合は、サブクラスから参照する場合、スーパクラスからは参照できず、
        // サブクラスからでないと参照できない。
        ExAccessB insB = new ExAccessB();
        System.out.println(insA.exProtected); //Mainクラスはサブクラスではないので、この場合はOK
        System.out.println(insB.exProtected);


    }
}