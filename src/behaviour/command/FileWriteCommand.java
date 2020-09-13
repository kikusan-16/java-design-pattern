package behaviour.command;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteCommand implements Command {

    // ファイルパス
    private Path path;

    // コンストラクタ
    public FileWriteCommand(String path) {
        super();
        this.path = Paths.get(path);
    }

    @Override
    public void execute() throws Exception {

        System.out.println("ファイル書き込み開始");

        // データ取得
        List<String> list = DbUtil.getEmployeeList();

        // ファイル作成
        FileUtil.createFile(path);

        // ファイルへ書き込み
        FileUtil.write(path, list);

        System.out.println("ファイル書き込み終了");
    }
}
