package behaviour.iterator;

public class ItemBag implements Aggregate {

    // Itemを10個まで持てる
    private Item[] itemArray;

    // 配列のインデックス
    private int last = 0;

    // コンストラクタ
    public ItemBag(int maxSize) {
        super();
        this.itemArray = new Item[maxSize];
    }

    // アイテムの追加
    public void add(Item item) {
        itemArray[last] = item;
        last++;
    }

    // アイテムの取得
    public Item getItem(int index) {
        return itemArray[index];
    }

    // 長さの取得
    public int getLast() {
        return last;
    }

    @Override
    public SampleIterator iterator() {
        return new ItemBagIterator(this);
    }
}
