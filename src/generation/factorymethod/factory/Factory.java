package generation.factorymethod.factory;

public abstract class Factory {

    // Productを生成して登録するメソッド.
    public final Product create(String serialNumber) {

        // Productの生成
        Product product = createProduct(serialNumber);

        // 製品の登録
        registerProduct(product);

        return product;
    }

    // Productを生成する抽象メソッド
    protected abstract Product createProduct(String serialNumber);

    // Productを登録する抽象メソッド
    protected abstract void registerProduct(Product product);
}
