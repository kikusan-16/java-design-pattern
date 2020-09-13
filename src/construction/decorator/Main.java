package construction.decorator;

public class Main {

    public static void main(String[] args) {

        // コーンを作成
        IceCream corn = new Corn();

        // バニラアイス
        IceCream vanilla = new Vanilla(corn);
        System.out.println(vanilla.getName() + ":" + vanilla.getPrice());

        // チョコレートアイス
        IceCream choco = new Chocolate(corn);
        System.out.println(choco.getName() + ":" + choco.getPrice());

        // チョコとバニラをミックス
        IceCream mix = new Chocolate(new Vanilla(corn));
        System.out.println(mix.getName() + ":" + mix.getPrice());
    }
}
