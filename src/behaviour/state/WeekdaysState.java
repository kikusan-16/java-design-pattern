package behaviour.state;

import java.util.Calendar;
import java.util.Date;

public class WeekdaysState implements WeekState {

    // インスタンス生成(Singleton)
    private final static WeekState weekdaysState = new WeekdaysState();

    // コンストラクタ
    private WeekdaysState() {
        super();
    }

    // インスタンス取得メソッド
    public static WeekState getInstance() {
        return weekdaysState;
    }

    @Override
    public void setDate(Shop shop) {

        // 日付取得
        Date workDate = shop.getDate();

        // カレンダー型に変換
        Calendar cal = Calendar.getInstance();
        cal.setTime(workDate);

        // 曜日取得
        int calDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // 曜日判定(土日ならtrue）
        if ((calDayOfWeek == Calendar.SATURDAY || calDayOfWeek == Calendar.SUNDAY)) {

            // 休日状態に変更
            shop.changeState(HolidayState.getInstance());
        }
    }

    @Override
    public void open(Date date) {
        System.out.println(sdf.format(date) + " 平日：開店時間は１１時です");
    }

    @Override
    public void close(Date date) {
        System.out.println(sdf.format(date) + " 平日：閉店時間は２０時です");
    }

}
