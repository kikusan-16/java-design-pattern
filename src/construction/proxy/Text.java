package construction.proxy;

public interface Text {

    // ファイルパスを取得
    public String getFilePath();

    // ファイルパスをセット
    public void setFilePath(String filePath);

    // ファイルの中身を表示
    public void printAll();
}
