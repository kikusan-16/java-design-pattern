package behaviour.chainofresponsibility;

public class GeneralManager extends ApprovalPerson {

    // 部長が決裁できる稟議書のタイプの上限
    private int documentTypeLimit;

    // コンストラクタ
    public GeneralManager(String name, int documentTypeLimit) {
        super(name);
        this.documentTypeLimit = documentTypeLimit;
    }

    // 判定メソッド
    @Override
    protected boolean judge(DecisionRequest request) {

        // 稟議書のタイプが上限以下なら部長が決裁する
        if (request.getDocumentType() <= documentTypeLimit) {
            return true;
        }

        return false;
    }
}
