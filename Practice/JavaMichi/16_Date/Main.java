import java.util.Date;

class Main {
    public static void main(String[] args) {
        /**
         * 日時操作を可能にするクラスとして以下のようなものがある
         *      ・Dateクラス
         *      ・Calendarクラス
         *      ・SimpleDateFormatクラス
         *      ・TimeZoneクラス
         */
        ExDate();
        ExCalendar();
    }

    /* 単に日時を表示する際に手軽に利用できる。 */
    public static void ExDate() {
        // 現在時刻を保持したDateオブジェクトを生成する。
        Date date1 = new Date();

        // 1970/01/01 0:00 から1000000ms経過した日時を保持したオブジェクトを生成する。
        Date date2 = new Date(1000000);

        // 比較
        System.out.println(date1.compareTo(date2));
        System.out.println(date2);

        // 引数に指定されたDateオブジェクトより後か、前かの判定
        System.out.println(date1.after(date2));
        System.out.println(date1.before(date2));
    }

    /* 詳細な日付・時刻の表示、操作が行える */
    public static void ExCalendar() {
        
    }
}