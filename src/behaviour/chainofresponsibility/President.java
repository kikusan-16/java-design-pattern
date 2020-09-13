package behaviour.chainofresponsibility;

public class President extends ApprovalPerson {

    // 社長が決裁できる稟議書のタイプの上限
    private int documentTypeLimit;

    // コンストラクタ
    public President(String name, int documentTypeLimit) {
        super(name);
        this.documentTypeLimit = documentTypeLimit;
    }

    // 判定メソッド
    @Override
    protected boolean judge(DecisionRequest request) {

        // 稟議書のタイプが上限以下なら社長が決裁する
        if (request.getDocumentType() <= documentTypeLimit) {
            return true;
        }

        return false;
    }
}
