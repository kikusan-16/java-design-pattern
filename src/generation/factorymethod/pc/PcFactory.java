package generation.factorymethod.pc;

import generation.factorymethod.factory.Factory;
import generation.factorymethod.factory.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * PCのFactoryクラス.
 */
public class PcFactory extends Factory {

    private List<String> serialNumberList = new ArrayList();

    @Override
    protected Product createProduct(String serialNumber) {
        return new Pc(serialNumber);
    }

    @Override
    protected void registerProduct(Product product) {
        serialNumberList.add(((Pc) product).getSerialNumber());
    }

    public List<String> getSerialNumberList() {
        return serialNumberList;
    }

}
