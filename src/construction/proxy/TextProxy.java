package construction.proxy;

public class TextProxy implements Text {

    // ファイルパス
    private String filePath;

    // 本人（テキストファイルを扱うクラス）
    private RealText real;

    // コンストラクタ1
    public TextProxy() {
        super();
    }

    // コンストラクタ2
    public TextProxy(String filePath) {
        super();
        this.filePath = filePath;
    }

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public synchronized void setFilePath(String filePath) {
        this.filePath = filePath;

        if (real != null) {
            // 本人にも設定する
            real.setFilePath(filePath);
        }
    }

    @Override
    public void printAll() {

        // インスタンスがなかったら生成
        realize();

        // 本人に委譲
        real.printAll();
    }

    // 本人のインスタンスを生成するメソッド
    private synchronized void realize() {

        if (real == null) {
            System.out.println("本人のインスタンスを生成します");
            real = new RealText(this.filePath);
        }
    }

}
