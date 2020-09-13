package behaviour.iterator;

public class ItemBagIterator implements SampleIterator {

    // アイテム袋
    private ItemBag itemBag;

    // インデックス(どこまで数えたのかを管理)
    private int index;

    // コンストラクタ
    public ItemBagIterator(ItemBag itemBag) {
        super();
        this.itemBag = itemBag;
        this.index = 0;
    }

    @Override
    public Object next() {

        Item item = itemBag.getItem(this.index);
        this.index++;

        return item;
    }

    @Override
    public boolean hasNext() {

        //次が存在する場合はtrue
        //次が存在しない場合はfalse
        if(index < itemBag.getLast()) {
            return true;
        } else {
            return false;
        }
    }
}
