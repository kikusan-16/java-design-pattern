package construction.decorator;

public class Chocolate extends Ice {

    // チョコアイスの値段
    private int price = 70;

    protected Chocolate(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getPrice() {
        return price + iceCream.getPrice();
    }

    @Override
    public String getName() {
        return "チョコ" + iceCream.getName();
    }
}
