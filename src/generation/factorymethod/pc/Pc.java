package generation.factorymethod.pc;

import generation.factorymethod.factory.Product;

/**
 * パソコンのオブジェクト.
 */
public class Pc extends Product {

    private String serialNumber;

    public Pc(String serialNumber) {
        super();
        System.out.println(serialNumber + "のPCを作ります");
        this.serialNumber = serialNumber;
    }

    @Override
    public void use() {
        System.out.println(serialNumber + "のPCを使います");
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

}
