package behaviour.state;

import java.util.Date;

public class Shop {

    // 日付
    private Date date;

    // 曜日の状態
    private WeekState state = WeekdaysState.getInstance();

    // 日付を取得するメソッド
    public Date getDate() {
        return this.date;
    }

    // 日付をセットするメソッド
    public void setDate(Date date) {
        this.date = date;
        state.setDate(this);
    }

    // 状態を変更するメソッド
    public void changeState(WeekState state) {
        this.state = state;
    }

    // 開店するメソッド
    public void open() {
        state.open(this.date);
    }

    // 閉店するメソッド
    public void close() {
        state.close(this.date);
    }
}
