package generation.abstractfactory;

import generation.abstractfactory.factory.OsDisplaySystem;
import generation.abstractfactory.factory.OsFactory;
import generation.abstractfactory.factory.OsFileSystem;

public class Main {

    public static void main(String[] args) {

        // クラス名
        String className = "generation.abstractfactory.factory.windows.WindowsFactory";
        // String className = "generation.abstractfactory.factory.linux.LinuxFactory";

        // Factory生成
        OsFactory factory = OsFactory.getFactory(className);

        // DisplaySystem生成
        OsDisplaySystem displaySystem = factory.createDisplaySystem();
        displaySystem.displayOsName();
        displaySystem.displayStr("サンプル");

        // FileSystem生成
        OsFileSystem fileSystem = factory.createFileSystem();
        fileSystem.saveFile("sample.txt");

    }

}
