package behaviour.mediator;

public class HomeButton implements Button {

    // ボタン押せるかどうか
    private boolean enable;

    // behaviour.mediator.Mediator
    private Mediator mediator;

    // コンストラクタ
    public HomeButton(boolean enable, Mediator mediator) {
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
            mediator.consulting(Mediator.HOME_PRESS);
        } else {
            System.out.println("ホームボタンは現在無効状態です");
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
