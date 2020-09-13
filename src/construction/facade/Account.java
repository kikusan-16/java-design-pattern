package construction.facade;

public class Account {

    // 支店番号
    private int branchNumber;

    // 口座番号
    private String accountNumber;

    // 口座種別
    private String accountType;

    // 口座名義人
    private String accountHolder;

    // 預金額
    private int deposit;

    // ローン金額
    private int loan;

    // 返済ステータス
    // 0: 正常
    // 1: 異常
    private int repaymentStatus;

    // コンストラクタ
    public Account(int branchNumber, String accountNumber, String accountType, String accountHolder,
            int deposit, int loan, int repaymentStatus) {
        super();
        this.branchNumber = branchNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountHolder = accountHolder;
        this.deposit = deposit;
        this.loan = loan;
        this.repaymentStatus = repaymentStatus;
    }

    // 支店番号のgetter
    public int getBranchNumber() {
        return branchNumber;
    }

    // 支店番号のsetter
    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    // 口座番号のgetter
    public String getAccountNumber() {
        return accountNumber;
    }

    // 口座番号のsetter
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // 口座種別のgetter
    public String getAccountType() {
        return accountType;
    }

    // 口座種別のsetter
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // 口座名義人のgetter
    public String getAccountHolder() {
        return accountHolder;
    }

    // 口座名義人のsetter
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // 預金額のgetter
    public int getDeposit() {
        return deposit;
    }

    // 預金額のsetter
    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    // ローン金額のgetter
    public int getLoan() {
        return loan;
    }

    // ローン金額のsetter
    public void setLoan(int loan) {
        this.loan = loan;
    }

    // 返済ステータスのgetter
    public int getRepaymentStatus() {
        return repaymentStatus;
    }

    // 返済ステータスのsetter
    public void setRepaymentStatus(int repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
    }
}
