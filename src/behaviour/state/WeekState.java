package behaviour.state;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface WeekState {

    // 日付のフォーマット用
    public final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    // 日付をセットするメソッド
    public void setDate(Shop shop);

    // 開店時間を出力するメソッド
    public void open(Date date);

    // 閉店時間を出力するメソッド
    public void close(Date date);
}
