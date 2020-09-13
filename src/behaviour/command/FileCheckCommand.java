package behaviour.command;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCheckCommand implements Command {

    // ファイルパス
    private Path path;

    // コンストラクタ
    public FileCheckCommand(String path) {
        super();
        this.path = Paths.get(path);
    }

    @Override
    public void execute() throws Exception {

        System.out.println("ファイルチェック開始");

        // ファイルの存在チェックをする
        boolean existResult = FileUtil.existCheck(path);

        if (existResult == true) {

            // 存在する場合、削除する
            FileUtil.deleteFile(path);
        }

        System.out.println("ファイルチェック終了");
    }
}
