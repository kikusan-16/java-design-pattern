package main;

public class Data {

    // キー
    private String key;

    // 値
    private int value;

    // コンストラクタ
    public Data(String key, int value) {
        super();
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[key=" + key + ", value=" + value + "]";
    }
}
