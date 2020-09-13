package behaviour.mediator;

public class ApplicationButton implements Button {

    // ボタン押せるかどうか
    private boolean enable;

    // behaviour.mediator.Mediator
    private Mediator mediator;

    // コンストラクタ
    public ApplicationButton(boolean enable, Mediator mediator) {
        super();
        this.enable = enable;
        this.mediator = mediator;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void press() {

        if(enable == true) {
            // Mediatorに通知
            mediator.consulting(Mediator.APPLICATION_PRESS);
        } else {
            System.out.println("アプリケーションは既に起動中です");
        }
    }

    @Override
    public boolean isEnable() {
        return enable;
    }

    @Override
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
