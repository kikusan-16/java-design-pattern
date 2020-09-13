package generation.abstractfactory.factory.windows;

import generation.abstractfactory.factory.OsDisplaySystem;

public class WindowsDisplaySystem extends OsDisplaySystem {

    @Override
    public void displayOsName() {
        System.out.println("==================");
        System.out.println("★ Windows ★");
        System.out.println("==================");
        System.out.println();
    }

    @Override
    public void displayStr(String str) {
        System.out.println("==================");
        System.out.println("★" + str + "★");
        System.out.println("==================");
        System.out.println();
    }

}
