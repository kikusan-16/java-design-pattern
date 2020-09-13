package behaviour.templatemethod;

public class Main {

    public static void main(String[] args) {

        // プロセス１の実行
        AbstractProcess process1 = new CharDisplay('H');
        process1.execute();

        // 改行
        System.out.println();

        // プロセス２の実行
        AbstractProcess process2 = new StringDisplay("Hello");
        process2.execute();
    }
}
