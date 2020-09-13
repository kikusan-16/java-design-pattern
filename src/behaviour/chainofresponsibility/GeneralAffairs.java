package behaviour.chainofresponsibility;

public class GeneralAffairs extends ApprovalPerson {

    // コンストラクタ
    public GeneralAffairs(String name) {
        super(name);
    }

    // 判定メソッド
    // 庶務は決裁できないので常にfalseを返す
    @Override
    protected boolean judge(DecisionRequest request) {
        return false;
    }
}
