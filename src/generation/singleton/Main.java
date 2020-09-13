package generation.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("2つは同じインスタンスです");
        } else {
            System.out.println("End");
        }
    }
}
