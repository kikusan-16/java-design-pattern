package construction.decorator;

public class Corn extends IceCream {

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getName() {
        return "アイスクリーム";
    }
}
