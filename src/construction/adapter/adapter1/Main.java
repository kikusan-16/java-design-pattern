package construction.adapter.adapter1;

public class Main {

    public static void main(String[] args) {

        // ver1
        System.out.println("Version1");

        Show ver1 = new Show();
        ver1.showStr("Hello World");
        ver1.showNumber(100);

        // 改行
        System.out.println();

        // ver2(Adapter適用後)
        System.out.println("Version2");

        Print ver2 = new PrintAdapter();
        ver2.printStr("Hello World");
        ver2.printNumber(100);

    }
}
