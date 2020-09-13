package generation.abstractfactory.factory.windows;

import generation.abstractfactory.factory.OsFileSystem;

public class WindowsFileSystem extends OsFileSystem {

    @Override
    public String getFileSeparator() {
        return "\\";
    }

    @Override
    public String getRootPath() {
        return "C:\\";
    }

    @Override
    public void saveFile(String fileName) {
        String directory = getRootPath() + "work" + getFileSeparator() + fileName;
        System.out.println("save: " + directory);
    }
}
