package construction.flyweight;

public class Setting {

    // キー
    private String key;

    // 設定値(日本語)
    private String japaneseValue;

    // 設定値(英語)
    private String englishValue;

    // コンストラクタ
    public Setting(String key, String japaneseValue, String englishValue) {
        super();
        this.key = key;
        this.japaneseValue = japaneseValue;
        this.englishValue = englishValue;
    }

    // =======================
    // 各種getter
    // =======================
    public String getJapaneseValue() {
        return japaneseValue;
    }

    public String getEnglishValue() {
        return englishValue;
    }
}
