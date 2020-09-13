package behaviour.command;

import java.util.ArrayList;
import java.util.List;

public class DbUtil {

    // 接続確認するメソッド
    public static boolean connect() {

        // 結果用の変数
        boolean result = false;

        // 乱数
        double random = Math.random();

        // 半分は接続に成功する
        if (random >= 0.5) {

            result = true;
            System.out.println("DB接続成功");

        } else {

            System.out.println("DB接続失敗");
        }

        return result;
    }

    // 従業員のデータを返すメソッド
    public static List<String> getEmployeeList() {

        List<String> list = new ArrayList<>();

        list.add("山田,30歳");
        list.add("田中,25歳");
        list.add("田村,33歳");

        return list;
    }
}
