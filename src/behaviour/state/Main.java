package behaviour.state;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // 現在日付を生成
        Date date = new Date();

        // ショップを生成
        Shop shop = new Shop();

        // １週間のループ
        for (int i = 0; i < 7; i++) {

            // 日付をセット
            shop.setDate(date);

            // 開店
            shop.open();

            // 閉店
            shop.close();

            // 日付を１日進める
            date = addOneDay(date);
        }
    }

    // 日付を１日だけ進めるメソッド
    private static Date addOneDay(Date date) {

        // DateをCalendar型に変換
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        // 日付に１日を足す
        cal.add(Calendar.DATE, 1);

        // CalendarからDateを生成して返却
        return cal.getTime();
    }

}
