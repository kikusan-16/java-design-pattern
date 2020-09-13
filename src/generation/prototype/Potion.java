package generation.prototype;

public class Potion implements Item {

    // 名前
    private String name;

    // コンストラクタ
    public Potion(String name) {
        super();
        this.name = name;
    }

    // アイテムを獲得するメソッド
    @Override
    public void get() {
        System.out.println(name + "を獲得しました");
    }

    // アイテムを使うメソッド
    @Override
    public void use() {
        System.out.println(name + "を使いました");
    }

    // クローンを生成するメソッド
    @Override
    public Item createClone() {
        Item item = null;
        try {
            item = (Item)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }
}

