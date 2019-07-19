import java.text.*;
import java.util.*;

/**
 * インタフェースとabstractクラスの違い
 * ・インタフェースは、メソッド本体を定義することは不可。
 * 　abstractクラスは、本体を定義したメソッドが含まれていても良い。
 * ・インタフェースは複数実装できるが、abstractクラスは一つのみしか継承できない。
 */
class ExInterface implements Greeting, ShowingDate { // インタフェースを実装する際は implements すること
    public void greet() {
        System.out.println("こんにちは");
    }

    public void showDate() {
        SimpleDateFormat dateformatter = new SimpleDateFormat("yyyy/MM/dd");
        String dateStr = dateformatter.format(new Date());
        System.out.println(dateStr);
    }

    public static void main(String[] args) {
        ExInterface obj = new ExInterface();
        obj.greet();
        obj.showDate();
        System.out.println(COUNTRY); // 実装しているインタフェースの変数は単純名で参照できる。
    }
}