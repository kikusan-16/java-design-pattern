package generation.abstractfactory.factory.windows;

import generation.abstractfactory.factory.OsDisplaySystem;
import generation.abstractfactory.factory.OsFactory;
import generation.abstractfactory.factory.OsFileSystem;

public class WindowsFactory extends OsFactory {

    @Override
    public OsFileSystem createFileSystem() {
        return new WindowsFileSystem();
    }

    @Override
    public OsDisplaySystem createDisplaySystem() {
        return new WindowsDisplaySystem();
    }

}
