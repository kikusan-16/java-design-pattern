package construction.proxy;

public class Main {

    public static void main(String[] args) {

        // 代理人生成
        Text sampleText = new TextProxy();
        sampleText.setFilePath("sample.txt");
        sampleText.printAll();
    }

}
