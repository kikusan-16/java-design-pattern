package construction.facade;

public class Main {

    public static void main(String[] args) {

        // 山田太郎の口座番号
        String yamadaAccount = "0001";
        // 山田太郎がローンを組んでみる
        int yamadaResult = BankManager.takeLoan(yamadaAccount, 1000000);

        System.out.println();

        // 田中花子の口座番号
        String tanakaAccount = "0002";
        // 田中がローンを組んでみる
        int tanakaResult = BankManager.takeLoan(tanakaAccount, 1000000);
    }
}
