package behaviour.command;

public class DbCheckCommand implements Command {

    @Override
    public void execute() throws Exception {

        // 接続確認
        boolean connectCheck = DbUtil.connect();

        if (connectCheck == false) {
            throw new Exception("DB接続に失敗しました");
        }
    }
}
