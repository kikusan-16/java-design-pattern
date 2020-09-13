package generation.factorymethod;

import generation.factorymethod.factory.Factory;
import generation.factorymethod.factory.Product;
import generation.factorymethod.pc.PcFactory;

public class Main {

    public static void main(String[] args) {

        //Factoryインスタンスの生成
        Factory factory = new PcFactory();

        //製品を作る
        Product pc1 = factory.create("A001");
        Product pc2 = factory.create("A002");
        Product pc3 = factory.create("A003");

        // 改行
        System.out.println();

        //製品を使う
        pc1.use();
        pc2.use();
        pc3.use();
    }
}
