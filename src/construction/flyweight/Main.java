package construction.flyweight;

public class Main {

    public static void main(String[] args) {

        // Factoryの取得
        SettingFactory factory = SettingFactory.getFactory();

        // 設定値の取得(ユーザーID)
        Setting userId = factory.getSetting("userId");
        System.out.println(userId.getJapaneseValue());
        System.out.println(userId.getEnglishValue());

        // 改行
        System.out.println();

        // 取得２回目
        Setting userId2 = factory.getSetting("userId");
        System.out.println(userId2.getJapaneseValue());
        System.out.println(userId2.getEnglishValue());

        // 改行
        System.out.println();

        // 設定値の取得(パスワード)
        Setting password = factory.getSetting("password");
        System.out.println(password.getJapaneseValue());
        System.out.println(password.getEnglishValue());
    }
}
