package construction.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SettingFactory {

    // Settingのインスタンスを管理
    private Map<String, Setting> pool = new HashMap<>();

    // Singletonパターン
    private static SettingFactory factory = new SettingFactory();

    // コンストラクタ
    private SettingFactory() {

    }

    // Factoryを取得するメソッド
    public static SettingFactory getFactory() {
        return factory;
    }

    // Settingのインスタンス生成・再利用するメソッド
    public synchronized Setting getSetting(String key) {

        // 設定値の変数
        Setting result = null;

        // ==========================
        // 設定値の取得
        // ==========================
        // Mapにキーが含まれているかどうかを取得
        boolean exist = pool.containsKey(key);

        if (exist == true) {

            // Mapにキーが含まれている場合、Mapから取得
            result = pool.get(key);

        } else {

            // Mapにキーが含まれていない場合、データベースから取得
            System.out.println("データベースから取得中: " + key);
            result = Database.getSetting(key);

            if (result == null) {

                // データベースにも存在しない場合はnullを返す
                return null;

            } else {

                // データベースに存在した場合は、poolに入れる
                pool.put(key, result);

            }
        }

        return result;
    }
}
