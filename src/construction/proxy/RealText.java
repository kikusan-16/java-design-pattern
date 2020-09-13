package construction.proxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RealText implements Text {

    // ファイルパス
    private String filePath;

    // Pathインターフェース
    private Path path;

    // コンストラクタ1
    public RealText() {
        super();
    }

    // コンストラクタ2
    public RealText(String filePath) {
        super();
        this.filePath = filePath;
        this.path = Paths.get(filePath);
    }

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public void setFilePath(String filePath) {
        this.filePath = filePath;
        this.path = Paths.get(filePath);
    }

    @Override
    public void printAll() {

        try {
            // テキストファイルの中身を全て読取
            List<String> lineList = Files.readAllLines(this.path);

            // 中身を表示
            for (String line : lineList) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
