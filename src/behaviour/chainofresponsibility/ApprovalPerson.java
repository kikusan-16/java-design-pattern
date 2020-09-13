package behaviour.chainofresponsibility;

public abstract class ApprovalPerson {

    // 各担当者の名前
    private String name;

    // たらい回し先
    private ApprovalPerson next;

    // コンストラクタ
    public ApprovalPerson(String name) {
        super();
        this.name = name;
    }

    // たらい回し先の設定
    public ApprovalPerson setNext(ApprovalPerson next) {
        this.next = next;
        return next;
    }

    // 決裁メソッド
    public final void decision(DecisionRequest request) {

        if (judge(request)) {

            // 決裁完了
            done(request);

        } else if (next != null) {

            // 次の決裁者が決裁をする
            next.decision(request);

        } else {

            // 誰も決裁できず
            fail(request);
        }
    }

    // 判定メソッド
    // このメソッドで担当者が決裁できるかどうかを判定します
    protected abstract boolean judge(DecisionRequest request);

    // 決裁完了
    protected void done(DecisionRequest request) {
        System.out.println(request + " is decisioned by " + name);
    }

    // 決裁できず
    protected void fail(DecisionRequest request) {
        System.out.println(request + " is not decisioned");
    }
}
