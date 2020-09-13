package behaviour.iterator;

public class Item {

    // アイテム名
    private String itemName;

    // コンストラクタ
    public Item(String itemName) {
        super();
        this.itemName = itemName;
    }

    // getter
    public String getItemName() {
        return itemName;
    }

    // setter
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
