package construction.facade;

/**
 * 銀行システムを利用するために外部公開されているインターフェース.
 */
public class BankManager {

    // 正常終了のコード値
    private final static int SUCCESS = 0;

    // 異常終了
    private final static int ERROR = 1;

    // ローンを組むインターフェース(API)
    // 0: 正常終了
    // 1: 異常終了
    public static int takeLoan(String accountNumber, int loanAmount) {

        // ===========================
        // 口座の存在チェック
        // ===========================
        boolean existsAccount = BankSystem.existsAccount(accountNumber);
        if(existsAccount == false) {
            System.out.println("口座情報が存在しません");
            return ERROR;
        }

        // ===========================
        // 返済ステータスのチェック
        // ===========================
        boolean checkRepaymentStatus = BankSystem.isTakeLoan(accountNumber);
        if(checkRepaymentStatus == false) {
            System.out.println("返済が滞っているため、"
                    + "新規ローンを組めません");
            return ERROR;
        }

        // ===========================
        // ローンを組む
        // ===========================
        boolean takeLoan = BankSystem.takeLoan(accountNumber, loanAmount);
        if(takeLoan == false) {
            System.out.println("ローンを組むのに失敗しました");
            return ERROR;
        }

        System.out.println("ローンを組みました");

        return SUCCESS;
    }
}
