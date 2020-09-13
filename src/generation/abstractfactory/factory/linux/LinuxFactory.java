package generation.abstractfactory.factory.linux;

import generation.abstractfactory.factory.OsDisplaySystem;
import generation.abstractfactory.factory.OsFactory;
import generation.abstractfactory.factory.OsFileSystem;

public class LinuxFactory extends OsFactory {

    @Override
    public OsFileSystem createFileSystem() {
        return new LinuxFileSystem();
    }

    @Override
    public OsDisplaySystem createDisplaySystem() {
        return new LinuxDisplaySystem();
    }

}
