package behaviour.command;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtil {

    // ファイルが存在するかチェック
    // true: 存在する
    // false: 存在しない
    public static boolean existCheck(Path path) {

        boolean result = false;

        // 存在チェック
        result = Files.exists(path);

        return result;
    }

    // ファイルを削除するメソッド
    public static void deleteFile(Path path) throws IOException {

        try {
            // ファイル削除
            Files.delete(path);
            System.out.println("ファイル削除：" + path);

        } catch (IOException e) {
            System.out.println("ファイル削除に失敗しました");
            e.printStackTrace();
            throw e;
        }
    }

    // ファイルを作成するメソッド
    public static void createFile(Path path) throws IOException {

        try {
            // ファイル作成
            Files.createFile(path);
            System.out.println("ファイル作成：" + path);

        } catch (IOException e) {
            System.out.println("ファイル作成に失敗しました");
            e.printStackTrace();
            throw e;
        }
    }

    // ファイルに書き込みをするメソッド
    public static void write(Path path, List<String> list) throws IOException {

        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str + "\n");
        }

        try {
            byte[] bytes = sb.toString().getBytes();

            // ファイルへ書き込み
            Files.write(path, bytes);

        } catch (IOException e) {
            System.out.println("ファイル書き込みに失敗しました");
            e.printStackTrace();
            throw e;
        }
        System.out.println("ファイル書込：" + path);
    }
}
