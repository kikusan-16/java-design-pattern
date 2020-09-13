package behaviour.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MacroCommand implements Command {

    // コマンドを持っておくフィールド
    private List<Command> commandList = new ArrayList<>();

    @Override
    public void execute() throws Exception {
        // Listの中のCommandを実行
        Iterator<Command> it = commandList.iterator();

        while (it.hasNext()) {
            Command command = it.next();
            command.execute();
        }
    }

    // Listにコマンドを追加するメソッド
    public void addCommand(Command command) {
        commandList.add(command);
    }
}
