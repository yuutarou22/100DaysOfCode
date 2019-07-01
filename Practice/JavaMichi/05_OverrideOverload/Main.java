class Main {
    public static void main(String[] args) {
        ExClassA classA = new ExClassA();
        ExClassB classB = new ExClassB();
    
        System.out.println(classA.calcurate(5));
        System.out.println(classB.calcurate(5));
        System.out.println(classB.calcurate(2,3));
        System.out.println(classB.calcurate(2,3,4));
    }
}