import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Main {
    public static void main(String[] args) {
        /**
         * Javaでは、例外が発生したメソッド内で例外ハンドラを発見できなかった場合、
         * 例外ハンドラを求めてメソッドの呼び出し元へ遡って探しに行く。
         * 
         * A -> B -> C 例外発生
         * 　　　　　　|
         * A <- B <- C メソッド内に例外ハンドラ無い
         * 
         * この時、各メソッド（上記、B、C）は、発生した例外ハンドラを
         * 元のメソッドに遡るよう明示的に示す必要がある。
         */

        Main main = new Main();
        main.methodA();
        main.methodC(15);
    }

    void methodA() {
        try {
            methodB();
        } catch(FileNotFoundException e) {
            System.err.println(e.getMessage());;
        } finally {
            System.out.println("Finish");
        }
    }

    void methodB() throws FileNotFoundException {
        FileReader exFile = new FileReader("exFile.txt");
    }

    void methodC(int num) {
        // throwは任意の場所で例外を発生させることができる
        if (num < 10) {
            throw new IllegalArgumentException("10以上の値をください");
        }

        /**
         * assert(アサーション)は、バグを減らすためのプログラム開発補助機能
         * 特定の条件をアサーションで記載しておくと、その条件を「満たさない」場合は
         * AssertionError を返す。
         */
        assert num == 100 : "100じゃないです";
    }
}