package generation.abstractfactory.factory.linux;

import generation.abstractfactory.factory.OsFileSystem;

public class LinuxFileSystem extends OsFileSystem {

    @Override
    public String getFileSeparator() {
        return "/";
    }

    @Override
    public String getRootPath() {
        return "/";
    }

    @Override
    public void saveFile(String fileName) {
        String directory = getRootPath() + "usr" + getFileSeparator() + fileName;
        System.out.println("save: " + directory);
    }

}
