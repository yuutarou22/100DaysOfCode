/**
 * @author Yutaro M
 * @version 0.0.1
 * http://mitani.cs.tsukuba.ac.jp/book_support/java/java_dril_method30.pdf
 */
public class Practice {
    public static void main(String[] args) {
        double doubleValue = getTriangleArea(8.2, 4.0);
        System.out.println(doubleValue);
        printHello();
    }

    static double getTriangleArea(double height, double base) {
        return (height * base) / 2.0;
    }

    static void printHello() {
        System.out.println("Hello");
    }
}