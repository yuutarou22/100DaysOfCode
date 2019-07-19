import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

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
        // Calendarクラスのコンストラクタはprotectedで宣言されており、他のクラスから使用できないため、
        // そのためCalendarオブジェクトを作成してファクトリメソッドを使う。
        
        // デフォルトのロケール、タイムゾーンのオブジェクトを生成
        Calendar calendar1 = Calendar.getInstance();
        // System.out.println(calendar1);
        // ロケールがUSAのオブジェクトを生成
        Calendar calendar2 = Calendar.getInstance(Locale.US);
        // System.out.println(calendar2);
        // タイムゾーンがロンドンのオブジェクトを生成
        TimeZone TZ1 = TimeZone.getTimeZone("Europe/London");
        Calendar calendar3 = Calendar.getInstance(TZ1);
        // System.out.println(calendar3);

        // Calendarクラスのフィールドを取得し、現在時刻を取得する。
        int year = calendar1.get(Calendar.YEAR);
        int month = calendar1.get(Calendar.MONTH) + 1;
        int day = calendar1.get(Calendar.DATE);
        int hour = calendar1.get(Calendar.HOUR_OF_DAY);
        int minute = calendar1.get(Calendar.MINUTE);
        int second = calendar1.get(Calendar.SECOND);

        StringBuffer dow = new StringBuffer();
        switch (calendar1.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY: dow.append("日曜日"); break;
            case Calendar.MONDAY: dow.append("月曜日"); break;
            case Calendar.TUESDAY: dow.append("火曜日"); break;
            case Calendar.WEDNESDAY: dow.append("水曜日"); break;
            case Calendar.THURSDAY: dow.append("木曜日"); break;
            case Calendar.FRIDAY: dow.append("金曜日"); break;
            case Calendar.SATURDAY: dow.append("土曜日"); break;
            default: break;
        }

        System.out.println(year + "/" + month + "/" + day + " " + dow + " " + hour + ":" + minute + ":" + second);
    }
}