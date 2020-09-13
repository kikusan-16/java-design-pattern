package construction.facade;

import java.util.HashMap;
import java.util.Map;

/**
 * 銀行のシステム.
 */
public class BankSystem {

    // 口座番号をキーに持つMap
    private static Map<String, Account> accountMap = new HashMap<>();

    // staticイニシャライザ
    static {
        // 預金者の情報を生成してMapにセット
        Account yamada = new Account(1, "0001", "普通", "山田太郎", 100000, 1000000, 1);
        Account tanaka = new Account(1, "0002", "普通", "田中花子", 200000, 0, 0);

        accountMap.put("0001", yamada);
        accountMap.put("0002", tanaka);
    }

    // 口座情報を取得するメソッド.
    public static Account getAccount(String accountNumber) {
        return accountMap.get(accountNumber);
    }

    // 口座情報が存在するかどうかを確認するメソッド.
    // true:存在する
    // false:存在しない
    public static boolean existsAccount(String accountNumber) {

        Account account = getAccount(accountNumber);

        if(account == null) {
            return false;
        }

        return true;
    }

    // ローンを組めるかどうかをチェックするメソッド.
    // true:ローンを組める
    // false:ローンを組めない
    public static boolean isTakeLoan(String accountNumber) {

        Account account = getAccount(accountNumber);

        //返済ステータスをチェック
        if(account.getRepaymentStatus() == 1) {
            // 異常だった場合、ローンは組めない
            return false;
        }

        return true;
    }

    // ローンを組むメソッド.
    // true:成功
    // false:失敗
    public static boolean takeLoan(String accountNumber, int loanAmount) {

        Account account = getAccount(accountNumber);

        // 預金額を増やす
        account.setDeposit(account.getDeposit() + loanAmount);

        // ローン金額を増やす
        account.setLoan(account.getLoan() + loanAmount);

        return true;
    }
}
