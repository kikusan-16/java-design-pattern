package behaviour.state;

import java.util.Calendar;
import java.util.Date;

public class HolidayState implements WeekState {

    // インスタンス生成(Singleton)
    private final static WeekState holidayState = new HolidayState();

    // コンストラクタ
    private HolidayState() {
        super();
    }

    // インスタンス取得メソッド
    public static WeekState getInstance() {
        return holidayState;
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

        // 曜日判定(土日以外ならtrue）
        if (!(calDayOfWeek == Calendar.SATURDAY || calDayOfWeek == Calendar.SUNDAY)) {

            // 平日状態に変更
            shop.changeState(WeekdaysState.getInstance());
        }
    }

    @Override
    public void open(Date date) {
        System.out.println(sdf.format(date) + " ★ 土日：開店時間は１０時です");
    }

    @Override
    public void close(Date date) {
        System.out.println(sdf.format(date) + " ★ 土日：閉店時間は２１時です");
    }

}
