package behaviour.iterator;

public class Main {

    public static void main(String[] args) {

        ItemBag itemBag = new ItemBag(10);
        itemBag.add(new Item("ポーション"));
        itemBag.add(new Item("エーテル"));
        itemBag.add(new Item("エリクサー"));

        SampleIterator it = itemBag.iterator();
        while(it.hasNext()) {
            Item item = (Item)it.next();
            System.out.println(item.getItemName());
        }

    }
}
