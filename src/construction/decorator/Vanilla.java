package construction.decorator;

public class Vanilla extends Ice {

    // バニラアイスの値段
    private int price = 50;

    protected Vanilla(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getPrice() {
        return price + iceCream.getPrice();
    }

    @Override
    public String getName() {
        return "バニラ" + iceCream.getName();
    }
}
